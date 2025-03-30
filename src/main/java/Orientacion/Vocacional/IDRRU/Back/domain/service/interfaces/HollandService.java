package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Holland;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.HollandDto;

import java.util.List;

public interface HollandService {

    Holland getById(Integer id);

    List<Holland> getAll();

    Holland create(HollandDto hollandDto);

}