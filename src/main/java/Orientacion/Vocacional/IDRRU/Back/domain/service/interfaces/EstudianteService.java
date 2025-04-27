package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EstudianteDto;

import java.util.List;

public interface EstudianteService {

    List<Estudiante> findAll();

    Estudiante findById(Integer id);

    Estudiante create(EstudianteDto estudianteDto);

    Estudiante update(Integer id, EstudianteDto estudianteDto);

    void delete(Integer id);
}
