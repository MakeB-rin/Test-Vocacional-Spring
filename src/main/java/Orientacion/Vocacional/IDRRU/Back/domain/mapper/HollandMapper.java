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

    public HollandDto fromEntityToDto(Holland holland) {
        if (holland == null) {
            return null;
        }
        HollandDto hollandDto = new HollandDto();
        hollandDto.setIdHolland(holland.getIdHolland());
        hollandDto.setCodigo(holland.getCodigo());
        hollandDto.setNombre(holland.getNombre());
        hollandDto.setDescripcion(holland.getDescripcion());
        return hollandDto;
    }

    public List<HollandDto> fromEntityListToDto(List<Holland> hollandList){
        List<HollandDto> hollandDtos = new ArrayList<>();
        for(Holland hollandAux : hollandList){
            HollandDto hollandDto = new HollandDto();
            hollandDto.setIdHolland(hollandAux.getIdHolland());
            hollandDto.setCodigo(hollandAux.getCodigo());
            hollandDto.setNombre(hollandAux.getNombre());
            hollandDto.setDescripcion(hollandAux.getDescripcion());
            hollandDtos.add(hollandDto);
        }
        return hollandDtos;
    }
}