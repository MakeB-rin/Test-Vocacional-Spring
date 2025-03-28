package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Facultad;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.FacultadDto;
import org.springframework.stereotype.Component;

@Component
public class FacultadMapper {

    public Facultad fromDtoToEntity(FacultadDto dto, Facultad facultad) {
        Facultad facultadAux = (facultad != null) ? facultad : new Facultad();
        facultadAux.setCodigo(dto.getCodigo());
        facultadAux.setNombre(dto.getNombre());
        return facultadAux;
    }

    // Metodo opcional para convertir entidad a DTO
    public FacultadDto fromEntityToDto(Facultad facultad) {
        if (facultad == null) {
            return null;
        }
        FacultadDto dto = new FacultadDto();
        dto.setIdFacultad(facultad.getIdFacultad());
        dto.setCodigo(facultad.getCodigo());
        dto.setNombre(facultad.getNombre());

        return dto;
    }
}