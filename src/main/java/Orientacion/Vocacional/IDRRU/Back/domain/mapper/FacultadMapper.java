package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Chaside;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Facultad;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Holland;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EstudianteDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.FacultadDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// Mapper para convertir entre DTO y entidad
@Component
public class FacultadMapper {

    /**
     * Convierte un DTO en una entidad Facultad.
     * @param dto DTO de Facultad.
     * @param facultad Instancia de Facultad existente (para actualizaciones) o null (para crear nueva).
     * @return Objeto Facultad con los datos del DTO.
     */
    public Facultad fromDtoToEntity(FacultadDto dto, Facultad facultad) {
        Facultad facultadAux = (facultad != null) ? facultad : new Facultad();
        facultadAux.setCodigo(dto.getCodigo());
        facultadAux.setNombre(dto.getNombre());

        Chaside chaside = new Chaside();
        chaside.setIdChaside(dto.getIdChaside());
        facultadAux.setChaside(chaside);
        return facultadAux;
    }

    /**
     * Convierte una entidad Facultad en un DTO.
     * @param facultad Objeto Facultad.
     * @return DTO con los datos de la entidad.
     */
    public FacultadDto fromEntityToDto(Facultad facultad) {
        if (facultad == null) {
            return null;
        }
        FacultadDto facultadDto = new FacultadDto();
        facultadDto.setIdFacultad(facultad.getIdFacultad());
        facultadDto.setCodigo(facultad.getCodigo());
        facultadDto.setNombre(facultad.getNombre());
        facultadDto.setUrl(facultad.getUrl());
        facultadDto.setImgLogo(facultad.getImgLogo());
        facultadDto.setCarreras(facultad.getCarreras());
        facultadDto.setIdChaside(facultad.getChaside() != null ? facultad.getChaside().getIdChaside() : null);
        return facultadDto;
    }

    public List<FacultadDto> fromEntityListToDto(List<Facultad> facultadList){
        List<FacultadDto> facultadDtos = new ArrayList<>();
        for(Facultad facultadAux : facultadList){

            FacultadDto facultadDto = new FacultadDto();

            facultadDto.setIdFacultad(facultadAux.getIdFacultad());
            facultadDto.setCodigo(facultadAux.getCodigo());
            facultadDto.setNombre(facultadAux.getNombre());
            facultadDto.setUrl(facultadAux.getUrl());
            facultadDto.setImgLogo(facultadAux.getImgLogo());
            facultadDto.setCarreras(facultadAux.getCarreras());
            if(facultadAux.getChaside() != null){
                facultadDto.setIdChaside(facultadAux.getChaside().getIdChaside());
            }
            facultadDtos.add(facultadDto);
        }


        return facultadDtos;
    }


}