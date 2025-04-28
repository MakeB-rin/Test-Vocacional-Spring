package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Resultado;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoResponse;

import java.util.List;

public interface ResultadoService {

    ResultadoDto create(ResultadoDto resultadoDto);

    ResultadoDto update(Integer id, ResultadoDto resultadoDto);

    ResultadoDto getById(Integer id);

    List<ResultadoDto> getAll();

    void changeState(Integer id);

    void delete(Integer id);

    List<ResultadoResponse> searchToMunicipioList();
}