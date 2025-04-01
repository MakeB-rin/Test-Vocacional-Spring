package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.MunicipioDto;
import java.util.List;

public interface MunicipioService {


  List<Municipio> getAll();
  Municipio create(MunicipioDto municipioDto);
  Municipio getById(Integer id);
  void delete(Integer id);

  void changeState(Integer id);

  Municipio update(Integer id, MunicipioDto municipioDto);
}
