package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDtoResponse;

import java.util.List;

public interface ResultadoService {

    ResultadoDto create(ResultadoDto resultadoDto);

    ResultadoDto update(Integer id, ResultadoDto resultadoDto);

    ResultadoDto getById(Integer id);

    List<ResultadoDto> getAll();

    void changeState(Integer id);

    void delete(Integer id);

    List<ResultadoDtoResponse> searchToProvinciaList(Long idProvincia,Long idMunicipio, String fechaInicio, String fechaFin);

    List<String> obtenerAniosDisponibles(Long idProvincia,Long idMunicipio);

    List<ResultadoDto> getByEstudianteId(Integer estudianteId);

//  List<ResultadoDtoResponse> searchToProvinciaList(Long idProvincia, String fecha);


}