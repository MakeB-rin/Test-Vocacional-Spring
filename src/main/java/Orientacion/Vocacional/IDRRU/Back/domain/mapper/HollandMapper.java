package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Chaside;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Holland;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ChasideDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.HollandDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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


    public HollandDto fromEntityToDto(Holland holland) {
        HollandDto hollandAux = new HollandDto();

        //seteo de los datos necesarios
        hollandAux.setIdHolland(holland.getIdHolland());
        hollandAux.setPersonalidad(holland.getPersonalidad());

        return hollandAux;
    }

    public List<HollandDto> fromEntityListToDto(List<Holland> hollandlist) {
        List<HollandDto> hollandList = new ArrayList<>();

        for(Holland holland : hollandlist){

            HollandDto hollandAuxDto = new HollandDto();

            hollandAuxDto.setIdHolland(holland.getIdHolland());
            hollandAuxDto.setPersonalidad(holland.getPersonalidad());

            hollandList.add(hollandAuxDto);
        }

        return hollandList;
    }

}
