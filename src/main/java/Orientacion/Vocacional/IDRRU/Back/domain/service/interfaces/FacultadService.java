package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Facultad;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.FacultadDto;

import java.util.List;

public interface FacultadService {
    Facultad create(FacultadDto facultadDto);
    Facultad update(Integer id, FacultadDto facultadDto);
    Facultad getById(Integer id);
    List<Facultad> getAll();
    void delete(Integer id);
}