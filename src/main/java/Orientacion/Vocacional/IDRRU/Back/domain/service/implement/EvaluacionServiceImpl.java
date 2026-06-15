package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.ConfiguracionRepository;
import Orientacion.Vocacional.IDRRU.Back.data.repository.EstudianteRepository;
import Orientacion.Vocacional.IDRRU.Back.data.repository.ResultadoRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Configuracion;
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
    private final ConfiguracionRepository configuracionRepository;

    private final EstudianteMapper estudianteMapper;
    private final ResultadoMapper resultadoMapper;

    @Override
    public EvaluacionResponseDto guardarEvaluacion(EvaluacionRequestDto evaluacionRequestDto) {

        // obtener la configuracion
        Configuracion configuracion = configuracionRepository.findById(1)
                .orElseThrow(()->
                        new RuntimeException("No existe la configuracion"));

        if(Boolean.FALSE.equals(configuracion.getFormularioHabilitado())){
            throw new RuntimeException("El formulario esta desahbilitado");
        }

        Estudiante estudiante;
        Resultado resultado;

        boolean guardarEnBD = Boolean.TRUE.equals(configuracion.getGuardarResultados())
                && evaluacionRequestDto.getEstudianteDto().getIdColegio() != null;

        // verificar si la opcion de guardar en la base de datos esta habilitada
        if(guardarEnBD){
            // guardamos el estudiante
            estudiante = estudianteMapper.fromDtoToEntity(evaluacionRequestDto.getEstudianteDto(), null);
            estudiante = estudianteRepository.save(estudiante);

            // guardamos el resultado
            resultado = resultadoMapper.fromDtoToEntity(evaluacionRequestDto.getResultadoDto(), null);
            resultado.setEstudiante(estudiante);
            resultado = resultadoRepository.save(resultado);

        } else {
            estudiante = estudianteMapper.fromDtoToEntity(evaluacionRequestDto.getEstudianteDto(), null);
            resultado = resultadoMapper.fromDtoToEntity(evaluacionRequestDto.getResultadoDto(), null);
        }

        String nombreColegio;
        if (estudiante.getColegio() != null) {
            nombreColegio = estudiante.getColegio().getNombre();
        } else {
            nombreColegio = estudiante.getNombreColegio();
        }

        // respondemos con la informacion para construir la pagina de resultados
        return EvaluacionResponseDto.builder()
                .guardarResultado(configuracion.getGuardarResultados())
                .nombre(estudiante.getNombre())
                .apPaterno(estudiante.getApPaterno())
                .apMaterno(estudiante.getApMaterno())
                .ciEstudiante(estudiante.getCiEstudiante())
                .nombreColegio(nombreColegio)
                .codigoSeguridad(
                        guardarEnBD
                                ? resultado.getCodigoSeguridad()
                                : null
                )
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
