package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Holland;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.HollandDto;
import org.springframework.stereotype.Component;

@Component
public class HollandMapper {

    public Holland fromDtoToEntity(HollandDto dto, Holland holland) {
        Holland hollandAux = new Holland();

        if (holland != null) {
            hollandAux = holland;
        }

        //seteo de los datos necesarios
        hollandAux.setPersonalidad(dto.getPersonalidad());

        return hollandAux;
    }

}
