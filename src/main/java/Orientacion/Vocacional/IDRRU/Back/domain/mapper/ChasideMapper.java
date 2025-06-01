package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Chaside;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ChasideDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChasideMapper {

    public ChasideDto fromEntityToDto(Chaside chaside) {
        if (chaside == null) {
            return null;
        }
        ChasideDto chasideDto = new ChasideDto();
        chasideDto.setIdChaside(chaside.getIdChaside());
        chasideDto.setCodigo(chaside.getCodigo());
        chasideDto.setDescripcion(chaside.getDescripcion());
        return chasideDto;
    }

    public List<ChasideDto> fromEntityListToDto(List<Chaside> chasideList){
        List<ChasideDto> chasideDtos = new ArrayList<>();
        for(Chaside chasideAux : chasideList){
            ChasideDto chasideDto = new ChasideDto();
            chasideDto.setIdChaside(chasideAux.getIdChaside());
            chasideDto.setCodigo(chasideAux.getCodigo());
            chasideDto.setDescripcion(chasideAux.getDescripcion());
            chasideDtos.add(chasideDto);
        }
        return chasideDtos;
    }
}