package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Resultado;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDto;

import java.util.List;

public interface ResultadoService {
    Resultado create(ResultadoDto resultadoDto);
    Resultado update(Integer id, ResultadoDto resultadoDto);
    Resultado getById(Integer id);
    List<Resultado> getAll();
    void delete(Integer id);
}