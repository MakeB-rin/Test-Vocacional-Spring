package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Provincia;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ProvinciaDto;

import java.util.List;

public interface ProvinciaService {

    ProvinciaDto getById(Integer id);

    List<ProvinciaDto> getAll();
}