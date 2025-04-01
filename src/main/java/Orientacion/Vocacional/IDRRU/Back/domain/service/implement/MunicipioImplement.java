package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.MunicipioRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.MunicipioMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.MunicipioService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.MunicipioDto;
import jakarta.transaction.Transactional;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class MunicipioImplement implements MunicipioService {

  private MunicipioRepository municipioRepository;
  @Autowired
  private MunicipioMapper municipioMapper;
  @Override
  public List<Municipio> getAll() {
    return municipioRepository.findAll();
  }

  @Override
  public Municipio create(MunicipioDto municipioDto) {
    Municipio municipio = municipioMapper.fromDtoToEntity(municipioDto, null);
    return municipioRepository.save(municipio);
  }

  @Override
  public Municipio getById(Integer id) {
    return municipioRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Municipio", id));
  }

  //eliminacion FISICA
  @Transactional
  @Override
  public void delete(Integer id) {

    municipioRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Municipio", id));
    municipioRepository.deleteById(id);
  }

  //eliminacion LOGICA
  @Override
  public void changeState(Integer id) {

    Municipio municipio = municipioRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Municipio", id));
    municipio.active= municipio.active? false: true;
    municipioRepository.save(municipio);
  }

  @Override
  public Municipio update(Integer id, MunicipioDto municipioDto) {
    Municipio municipioFound = municipioRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Municipio", id));
    Municipio municipioToSave = municipioMapper.fromDtoToEntity(municipioDto, municipioFound);

    return municipioRepository.save(municipioToSave);
  }
}
