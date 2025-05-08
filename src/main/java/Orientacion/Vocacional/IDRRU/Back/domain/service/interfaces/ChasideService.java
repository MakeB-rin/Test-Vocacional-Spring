package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Chaside;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ChasideDto;

import java.util.List;

public interface ChasideService {

    ChasideDto getById(Integer id);

    List<ChasideDto> getAll();

    ChasideDto create(ChasideDto chasideDto);

}