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

    @Override
    public FacultadDto findById(Integer id) {
        Facultad facultad = facultadRepository.findById(id).
                orElseThrow(() -> new EntityNotFoundException("Facultad no encontrada con id " + id));
        return facultadMapper.fromEntityToDto(facultad);
    }

    @Override
    public List<FacultadDto> findAll() {
        List<Facultad> facultadList = facultadRepository.findAll();
        return facultadMapper.fromEntityListToDto(facultadList);
    }
}