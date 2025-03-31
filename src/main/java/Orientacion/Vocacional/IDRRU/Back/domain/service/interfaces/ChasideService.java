package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Chaside;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ChasideDto;

import java.util.List;

public interface ChasideService {

    Chaside getById(Integer id);

    List<Chaside> getAll();

    Chaside create(ChasideDto chasideDto);

}