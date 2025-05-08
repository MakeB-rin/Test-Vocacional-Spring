package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Chaside;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ChasideDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChasideMapper {

    public Chaside fromDtoToEntity(ChasideDto dto, Chaside chaside) {
        Chaside chasideAux = new Chaside ();

        if (chaside != null) {
            chasideAux = chaside;
        }

        //seteo de los datos necesarios
        chasideAux.setCodigo(dto.getCodigo());

        return chasideAux;
    }

    public ChasideDto fromEntityToDto(Chaside chaside) {
        ChasideDto chasideAux = new ChasideDto();

        //seteo de los datos necesarios
        chasideAux.setIdChaside(chaside.getIdChaside());
        chasideAux.setCodigo(chaside.getCodigo());

        return chasideAux;
    }

    public List<ChasideDto> fromEntityListToDto(List<Chaside> chasidelist) {
        List<ChasideDto> chasideList = new ArrayList<>();
        for(Chaside chaside : chasidelist){

            ChasideDto chasideAuxDto = new ChasideDto();

            chasideAuxDto.setIdChaside(chaside.getIdChaside());
            chasideAuxDto.setCodigo(chaside.getCodigo());

            chasideList.add(chasideAuxDto);
        }

        return chasideList;
    }
}
