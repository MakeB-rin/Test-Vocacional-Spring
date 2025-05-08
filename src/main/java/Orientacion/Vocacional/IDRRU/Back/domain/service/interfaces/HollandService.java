package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Holland;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.HollandDto;

import java.util.List;

public interface HollandService {

    HollandDto getById(Integer id);

    List<HollandDto> getAll();

    HollandDto create(HollandDto hollandDto);

}