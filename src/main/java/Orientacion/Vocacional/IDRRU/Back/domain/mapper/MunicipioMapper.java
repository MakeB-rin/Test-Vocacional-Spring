package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.MunicipioDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ProvinciaDto;
import org.springframework.stereotype.Component;

@Component
public class MunicipioMapper {


  private final ProvinciaMapper provinciaMapper;

  public MunicipioMapper(ProvinciaMapper provinciaMapper) {
    this.provinciaMapper = provinciaMapper;
  }

  public Municipio fromDtoToEntity(MunicipioDto dto, Municipio municipio) {
    Municipio municipioAux = new Municipio ( );
    if (municipio != null) {
      municipioAux = municipio;
    }
    //seteo de los datos necesarios
    municipioAux.setNombre(dto.getNombre());
    return municipioAux;
  }


  public MunicipioDto fromEntityToDto(Municipio municipio) {
    MunicipioDto dto = new MunicipioDto ();

      dto.setIdMunicipio(municipio.getIdMunicipio());
      dto.setNombre(municipio.getNombre());
      if(municipio.getProvincia() != null){
        dto.setIdProvincia(municipio.getProvincia().getIdProvincia());
//        ProvinciaDto provinciaDtoAux = provinciaMapper.fromEntityToDto(municipio.getProvincia());
//        dto.setProvincia(provinciaDtoAux);
      }

      return dto;
  }


}
