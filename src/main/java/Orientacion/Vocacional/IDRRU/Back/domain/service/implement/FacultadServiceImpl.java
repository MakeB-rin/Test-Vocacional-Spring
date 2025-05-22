package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.FacultadRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Facultad;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.FacultadMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.FacultadService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.FacultadDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
// Servicio que maneja la lógica de negocio de Facultad
@Service
@AllArgsConstructor
public class FacultadServiceImpl implements FacultadService {

    private final FacultadRepository facultadRepository;
    private final FacultadMapper facultadMapper;

    /**
     * Crea una nueva Facultad a partir de un DTO.
     */
    @Override
    public FacultadDto create(FacultadDto facultadDto) {
        Facultad facultad = facultadMapper.fromDtoToEntity(facultadDto, null);
        Facultad facultadSave = facultadRepository.save(facultad);
        return facultadMapper.fromEntityToDto(facultadSave) ;
    }

    /**
     * Obtiene una Facultad por su ID.
     * Lanza una excepción si no se encuentra.
     */
    @Override
    public FacultadDto findById(Integer id) {
        Facultad facultad = facultadRepository.findById(id).
                orElseThrow(() -> new EntityNotFoundException("Facultad no encontrada con id " + id));

        return facultadMapper.fromEntityToDto(facultad);

    }

    /**
     * Retorna todas las facultades registradas.
     */
    @Override
    public List<FacultadDto> findAll() {
        List<Facultad> facultadList = facultadRepository.findAll();
        return facultadMapper.fromEntityListToDto(facultadList);
    }

    /**
     * Actualiza los datos de una Facultad.
     */
    @Override
    public FacultadDto update(Integer id, FacultadDto facultadDto) {
        Facultad existingFacultad = facultadRepository.findById(id).
                orElseThrow(() -> new EntityNotFoundException("Facultad no encontrada con id " + id));

        Facultad facultadEdit = facultadMapper.fromDtoToEntity(facultadDto, existingFacultad);
        Facultad facultadResultado = facultadRepository.save(facultadEdit);
        return facultadMapper.fromEntityToDto(facultadResultado);
    }

    /**
     * Elimina una Facultad por su ID.
     */
    @Override
    public void delete(Integer id) {
        Facultad facultad = facultadRepository.findById(id).
                orElseThrow(() -> new EntityNotFoundException("Facultad no encontrada con id " + id));

        facultadRepository.delete(facultad);
    }
}