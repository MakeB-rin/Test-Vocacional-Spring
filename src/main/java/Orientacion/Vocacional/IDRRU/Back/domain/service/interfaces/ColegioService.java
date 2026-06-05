package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ColegioDto;

import java.util.List;

public interface ColegioService {

    ColegioDto getById (Integer Id);

    List<ColegioDto> getAll();

}
