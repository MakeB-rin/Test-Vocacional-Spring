package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;


import Orientacion.Vocacional.IDRRU.Back.domain.entity.Provincia;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ProvinciaDto;

public interface ProvinciaService {
    Provincia create(ProvinciaDto provinciaDto);

    Provincia getById(Integer id);
}
