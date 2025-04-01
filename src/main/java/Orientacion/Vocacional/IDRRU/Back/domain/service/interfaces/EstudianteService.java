package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;

import java.util.List;

public interface EstudianteService {

    public List<Estudiante> findAll();

    public Estudiante findById(Integer id);
}
