package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.*;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.*;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.ResultadoMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ResultadoService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoResponse;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ResultadoServiceImpl implements ResultadoService {

    private final ResultadoRepository resultadoRepository;

    private final ResultadoMapper resultadoMapper;

    @Override
    public ResultadoDto create(ResultadoDto resultadoDto) {
        Resultado resultado = resultadoMapper.fromDtoToEntity(resultadoDto, null);
        Resultado resultadoSave = resultadoRepository.save(resultado);
        return resultadoMapper.fromEntityToDto(resultadoSave);
    }

    @Override
    public ResultadoDto getById(Integer id) {
        Resultado resultado = resultadoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Resultado no encontrado con id " + id));
        return resultadoMapper.fromEntityToDto(resultado);
    }

    @Override
    public List<ResultadoDto> getAll() {
        return resultadoMapper.fromEntityListToDtoList(resultadoRepository.findAll());
    }

    @Override
    public ResultadoDto update(Integer id, ResultadoDto resultadoDto) {
        Resultado resultadoId = resultadoRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Estudiante", id));
        Resultado resultadoEdit = resultadoMapper.fromDtoToEntity(resultadoDto, resultadoId);
        Resultado resultadoSave = resultadoRepository.save(resultadoEdit);
        return resultadoMapper.fromEntityToDto(resultadoSave);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        resultadoRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Estudiante", id));
        resultadoRepository.deleteById(id);
    }

    //eliminacion LOGICA
    @Override
    public void changeState(Integer id) {
        Resultado resultado = resultadoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Resultado", id));
        resultado.active= resultado.active? false: true;
        resultadoRepository.save(resultado);
    }


//    // Funcion nueva
//    @Override
//    public List<ResultadoResponse> searchToMunicipioList(){
//        return resultadoRepository.busquedaMunicipioList();
//    }

    @Override
    public List<ResultadoDto> getByEstudianteId(Integer estudianteId) {
        List<Resultado> resultados = resultadoRepository.findAllByEstudianteIdEstudiante(estudianteId);
        return resultados.stream()
                .map(resultadoMapper::fromEntityToDto)
                .collect(Collectors.toList());
    }

}