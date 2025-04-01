package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Facultad;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.FacultadDto;
import org.springframework.stereotype.Component;

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
        return new FacultadDto(facultad.getIdFacultad(), facultad.getCodigo(), facultad.getNombre());
    }
}