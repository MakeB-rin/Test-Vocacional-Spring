package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.EstudianteRepository;
import Orientacion.Vocacional.IDRRU.Back.data.repository.ResultadoRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Resultado;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.EstudianteMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.ResultadoMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.EvaluacionService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EvaluacionRequestDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EvaluacionResponseDto;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class EvaluacionServiceImpl implements EvaluacionService {

    private final EstudianteRepository estudianteRepository;
    private final ResultadoRepository resultadoRepository;

    private final EstudianteMapper estudianteMapper;
    private final ResultadoMapper resultadoMapper;

    @Override
    public EvaluacionResponseDto guardarEvaluacion(EvaluacionRequestDto evaluacionRequestDto) {
        // guardamos el estudiante
        Estudiante estudiante = estudianteMapper.fromDtoToEntity(evaluacionRequestDto.getEstudianteDto(), null);
        estudiante = estudianteRepository.save(estudiante);

        // guardamos el resultado
        Resultado resultado = resultadoMapper.fromDtoToEntity(evaluacionRequestDto.getResultadoDto(), null);
        resultado.setEstudiante(estudiante);
        resultado = resultadoRepository.save(resultado);

        // respondemos con la informacion para construir la pagina de resultados
        return EvaluacionResponseDto.builder()
                .nombre(estudiante.getNombre())
                .apPaterno(estudiante.getApPaterno())
                .apMaterno(estudiante.getApMaterno())
                .colegio(estudiante.getColegio().getNombre())
                .puntajeInteres(resultado.getInteres())
                .puntajeAptitud(resultado.getAptitud())
                .holland(resultado.getPuntajeHolland())
                .chaside(resultado.getPuntajeChaside())
                .celular(estudiante.getCelular())
                .curso(estudiante.getCurso())
                .edad(estudiante.getEdad())
                .provincia(estudiante.getMunicipio().getProvincia().getNombre())
                .municipio(estudiante.getMunicipio().getNombre())
                .build();
    }
}
