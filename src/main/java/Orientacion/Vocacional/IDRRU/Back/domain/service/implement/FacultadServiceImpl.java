package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.FacultadRepository;
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
    public Facultad create(FacultadDto facultadDto) {
        Facultad facultad = facultadMapper.fromDtoToEntity(facultadDto, null);
        return facultadRepository.save(facultad);
    }

    /**
     * Obtiene una Facultad por su ID.
     * Lanza una excepción si no se encuentra.
     */
    @Override
    public Facultad getById(Integer id) {
        return facultadRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Facultad no encontrada con id " + id));
    }

    /**
     * Retorna todas las facultades registradas.
     */
    @Override
    public List<Facultad> getAll() {
        return facultadRepository.findAll();
    }

    /**
     * Actualiza los datos de una Facultad.
     */
    @Override
    public Facultad update(Integer id, FacultadDto facultadDto) {
        Facultad existingFacultad = getById(id);
        facultadMapper.fromDtoToEntity(facultadDto, existingFacultad);
        return facultadRepository.save(existingFacultad);
    }

    /**
     * Elimina una Facultad por su ID.
     */
    @Override
    public void delete(Integer id) {
        Facultad facultad = getById(id);
        facultadRepository.delete(facultad);
    }
}