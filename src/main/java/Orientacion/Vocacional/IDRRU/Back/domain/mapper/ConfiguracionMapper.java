package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Configuracion;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ConfiguracionDto;
import org.springframework.stereotype.Component;

@Component
public class ConfiguracionMapper {

    public Configuracion fromDtoToEntity(ConfiguracionDto configuracionDto, Configuracion configuracion){
        Configuracion configuracionAux = new Configuracion();

        if (configuracion != null){
            configuracionAux = configuracion;
        }

        configuracionAux.setGuardarResultados(configuracionDto.getGuardarResultados());

        configuracionAux.setFormularioHabilitado(configuracionDto.getFormularioHabilitado());

        return configuracionAux;
    }

    public ConfiguracionDto fromEntityToDto(Configuracion configuracion){
        return ConfiguracionDto.builder()
                .idConfiguracion(configuracion.getIdConfiguracion())
                .guardarResultados(configuracion.getGuardarResultados())
                .formularioHabilitado(configuracion.getFormularioHabilitado())
                .build();
    }

}
