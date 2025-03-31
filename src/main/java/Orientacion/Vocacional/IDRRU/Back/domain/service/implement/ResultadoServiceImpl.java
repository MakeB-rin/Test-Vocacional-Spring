package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.FacultadRepository;
import Orientacion.Vocacional.IDRRU.Back.data.repository.ResultadoRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Facultad;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Resultado;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.ResultadoMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ResultadoService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ResultadoServiceImpl implements ResultadoService {

    private final ResultadoRepository resultadoRepository;
    private final ResultadoMapper resultadoMapper;
    private final FacultadRepository facultadRepository;
    // private final EstudianteRepository estudianteRepository;
    // private final ChasideRepository chasideRepository;
    // private final HollandRepository hollandRepository;


    @Override
    public Resultado create(ResultadoDto resultadoDto) {
        Resultado resultado = resultadoMapper.fromDtoToEntity(resultadoDto, null);
        Facultad facultad = facultadRepository.findById(resultadoDto.getIdFacultad())
                .orElseThrow(() -> new EntityNotFoundException("Facultad no encontrada con id " + resultadoDto.getIdFacultad()));
        resultado.setFacultad(facultad);

        /*
        // Resolver relación con Estudiante
        Estudiante estudiante = estudianteRepository.findById(resultadoDto.getIdEstudiante())
                .orElseThrow(() -> new EntityNotFoundException("Estudiante no encontrado con id " + resultadoDto.getIdEstudiante()));
        resultado.setEstudiante(estudiante);

        // Resolver relación con Chaside
        Chaside chaside = chasideRepository.findById(resultadoDto.getIdChaside())
                .orElseThrow(() -> new EntityNotFoundException("Chaside no encontrado con id " + resultadoDto.getIdChaside()));
        resultado.setChaside(chaside);

        // Resolver relación con Holland
        Holland holland = hollandRepository.findById(resultadoDto.getIdHolland())
                .orElseThrow(() -> new EntityNotFoundException("Holland no encontrado con id " + resultadoDto.getIdHolland()));
        resultado.setHolland(holland);
        */
        return resultadoRepository.save(resultado);
    }

    @Override
    public Resultado getById(Integer id) {
        return resultadoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Resultado no encontrado con id " + id));
    }

    @Override
    public List<Resultado> getAll() {
        return resultadoRepository.findAll();
    }

    @Override
    public Resultado update(Integer id, ResultadoDto resultadoDto) {
        Resultado existingResultado = getById(id);
        resultadoMapper.fromDtoToEntity(resultadoDto, existingResultado);

        if (resultadoDto.getIdFacultad() != null) {
            Facultad facultad = facultadRepository.findById(resultadoDto.getIdFacultad())
                    .orElseThrow(() -> new EntityNotFoundException("Facultad no encontrada con id " + resultadoDto.getIdFacultad()));
            existingResultado.setFacultad(facultad);
        }

        /*
        if(resultadoDto.getIdEstudiante() != null) {
            Estudiante estudiante = estudianteRepository.findById(resultadoDto.getIdEstudiante())
                .orElseThrow(() -> new EntityNotFoundException("Estudiante no encontrado con id " + resultadoDto.getIdEstudiante()));
            existingResultado.setEstudiante(estudiante);
        }
        */
        return resultadoRepository.save(existingResultado);
    }

    @Override
    public void delete(Integer id) {
        Resultado resultado = getById(id);
        resultadoRepository.delete(resultado);
    }
}