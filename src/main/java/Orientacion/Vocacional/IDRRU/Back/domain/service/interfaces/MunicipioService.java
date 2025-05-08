package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.MunicipioDto;
import java.util.List;

public interface MunicipioService {

  Municipio getById(Integer id);

  List<MunicipioDto> getAll();

}
