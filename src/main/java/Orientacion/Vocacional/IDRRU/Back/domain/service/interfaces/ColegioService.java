package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Colegio;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ColegioDto;

import java.util.List;

public interface ColegioService {

    ColegioDto getById (Integer Id);

    List<ColegioDto> getAll();

    ColegioDto create(ColegioDto dto);

    ColegioDto update(Integer Id, ColegioDto dto);

    void delete(Integer Id);

    List<ColegioDto> getByMunicipio(Integer idMunicipio);

}
