package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Provincia;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.MunicipioDto;
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
        provinciaAux.setIdProvincia(dto.getIdProvincia());
        return provinciaAux;
    }

    public ProvinciaDto fromEntityToDto(Provincia provincia) {
        ProvinciaDto dto = new ProvinciaDto();

        dto.setIdProvincia(provincia.getIdProvincia());
        dto.setNombre(provincia.getNombre());
        return dto;
    }

}
