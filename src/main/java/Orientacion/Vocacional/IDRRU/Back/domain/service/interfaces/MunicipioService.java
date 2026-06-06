package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.presentation.dto.MunicipioDto;
import java.util.List;

public interface MunicipioService {

  MunicipioDto getById(Integer id);

  List<MunicipioDto> getAll();

  List<MunicipioDto> getByIdProvincia(Integer idProvincia);

  MunicipioDto create(MunicipioDto dto);

  MunicipioDto update(Integer id, MunicipioDto dto);

  void delete(Integer id);

}