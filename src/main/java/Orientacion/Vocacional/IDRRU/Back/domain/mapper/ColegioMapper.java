package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Colegio;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ColegioDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ColegioMapper {

    public Colegio fromDtoToEntity(ColegioDto dto, Colegio colegio) {
        Colegio colegioAux = new Colegio();
        if (colegio != null){
            colegioAux = colegio;
        }
        colegioAux.setNombre(dto.getNombre());

        return colegioAux;
    }

    public ColegioDto fromEntityToDto(Colegio colegio){
        ColegioDto dto = new ColegioDto();

        dto.setIdColegio(colegio.getIdColegio());
        dto.setNombre(colegio.getNombre());

        if (colegio.getMunicipio() != null){
            dto.setIdMunicipio(colegio.getMunicipio().getIdMunicipio());
        }
        return dto;
    }

    public List<ColegioDto> fromEntityListToDto(List<Colegio> colegioList){
        List<ColegioDto> colegioDtos = new ArrayList<>();

        for (Colegio colegio : colegioList){
            ColegioDto colegioDto = new ColegioDto();

            colegioDto.setIdColegio(colegio.getIdColegio());
            colegioDto.setNombre(colegio.getNombre());
            colegioDto.setIdMunicipio(colegio.getMunicipio().getIdMunicipio());

            colegioDtos.add(colegioDto);
        }

        return colegioDtos;
    }
}
