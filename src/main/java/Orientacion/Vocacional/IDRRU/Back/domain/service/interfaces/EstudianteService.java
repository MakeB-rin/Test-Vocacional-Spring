package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EstudianteDto;

import java.util.List;

public interface EstudianteService {

    List<EstudianteDto> findAll();

    EstudianteDto findById(Integer id);

    EstudianteDto create(EstudianteDto estudianteDto);

    EstudianteDto update(Integer id, EstudianteDto estudianteDto);

    void changeState(Integer id);

    void delete(Integer id);
}
