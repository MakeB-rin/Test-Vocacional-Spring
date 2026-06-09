package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ConfiguracionDto;

public interface ConfiguracionService {

    ConfiguracionDto getConfiguracion();

    ConfiguracionDto update(Integer id, ConfiguracionDto configuracionDto);
}
