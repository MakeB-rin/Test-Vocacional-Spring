package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.presentation.dto.FacultadDto;
import java.util.List;


// Interfaz del servicio para operaciones de Facultad
public interface FacultadService {

    FacultadDto findById(Integer id);

    List<FacultadDto> findAll();

}