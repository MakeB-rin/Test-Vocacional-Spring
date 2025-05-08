package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.MunicipioDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MunicipioMapper {

  public Municipio fromDtoToEntity(MunicipioDto dto, Municipio municipio) {
    Municipio municipioAux = new Municipio ( );
    if (municipio != null) {
      municipioAux = municipio;
    }
    //seteo de los datos necesarios
    municipioAux.setIdMunicipio(dto.getIdMunicipio());
    municipioAux.setNombre(dto.getNombre());
    return municipioAux;
  }

  public MunicipioDto fromEntityToDto(Municipio municipio) {
    MunicipioDto dto = new MunicipioDto ();

    dto.setIdMunicipio(municipio.getIdMunicipio());
    dto.setNombre(municipio.getNombre());
    if(municipio.getProvincia() != null){
        dto.setIdProvincia(municipio.getProvincia().getIdProvincia());
      // ProvinciaDto provinciaDtoAux = provinciaMapper.fromEntityToDto(municipio.getProvincia());
      // dto.setProvincia(provinciaDtoAux);
    }
    return dto;
  }

  public List<MunicipioDto> fromEntityListToDto (List<Municipio> municipioList){

    List<MunicipioDto> municipioDtos = new ArrayList<>();

    for(Municipio municipio : municipioList){

      MunicipioDto municipioDto = new MunicipioDto();

      municipioDto.setIdMunicipio(municipio.getIdMunicipio());
      municipioDto.setNombre(municipio.getNombre());
      municipioDto.setIdProvincia(municipio.getProvincia().getIdProvincia());

      municipioDtos.add(municipioDto);
    }
    return municipioDtos;
  }
}
