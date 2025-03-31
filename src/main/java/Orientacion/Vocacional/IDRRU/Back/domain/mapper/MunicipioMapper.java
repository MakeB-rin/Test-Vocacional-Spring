package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.MunicipioDto;
import org.springframework.stereotype.Component;

@Component
public class MunicipioMapper {


  public Municipio fromDtoToEntity(MunicipioDto dto, Municipio municipio) {
    Municipio municipioAux = new Municipio ( );
    if (municipio != null) {
      municipioAux = municipio;
    }
    //seteo de los datos necesarios
    municipioAux.setNombre(dto.getNombre());
    return municipioAux;
  }
}
