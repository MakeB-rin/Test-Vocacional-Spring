package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Provincia;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ProvinciaDto;
import org.springframework.stereotype.Component;

@Component
public class ProvinciaMapper {

    public Provincia fromDtoToEntity(ProvinciaDto dto, Provincia provincia) {
        Provincia provinciaAux = new Provincia ( );
        if (provincia != null) {
            provinciaAux = provincia;
        }
        //seteo de los datos necesarios
        provinciaAux.setNombre(dto.getNombre());
        return provinciaAux;
    }
}
