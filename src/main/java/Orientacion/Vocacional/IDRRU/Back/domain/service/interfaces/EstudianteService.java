package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EstudianteDto;

import java.util.List;

public interface EstudianteService {

    public List<Estudiante> findAll();

    public Estudiante findById(Integer id);

    public Estudiante create(EstudianteDto estudianteDto);

    public Estudiante update(Integer id, EstudianteDto estudianteDto);

    public void delete(Integer id);
}
