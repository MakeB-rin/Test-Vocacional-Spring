package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ChasideDto;
import java.util.List;

public interface ChasideService {

    ChasideDto findById(Integer id);

    List<ChasideDto> findAll();
}