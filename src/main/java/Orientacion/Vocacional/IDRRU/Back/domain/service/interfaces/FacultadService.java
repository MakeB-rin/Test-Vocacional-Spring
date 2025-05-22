package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Facultad;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.FacultadDto;

import java.util.List;
// Interfaz del servicio para operaciones de Facultad
public interface FacultadService {

    FacultadDto create(FacultadDto facultadDto);

    FacultadDto update(Integer id, FacultadDto facultadDto);

    FacultadDto findById(Integer id);
    List<FacultadDto> findAll();
    void delete(Integer id);
}