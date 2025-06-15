package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.MunicipioRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.MunicipioMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.MunicipioService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.MunicipioDto;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class MunicipioServiceImpl implements MunicipioService {

  private MunicipioRepository municipioRepository;

  @Autowired
  private MunicipioMapper municipioMapper;

  @Override
  public List<MunicipioDto> getAll() {
    List<Municipio> municipioList = municipioRepository.findAll();
    return municipioMapper.fromEntityListToDto(municipioList);
  }

  @Override
  public MunicipioDto getById(Integer id) {
    Municipio municipio = municipioRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Municipio", id));
    return municipioMapper.fromEntityToDto(municipio);
  }


  public List<MunicipioDto> getByIdProvincia(Integer provinciaId) {
    // Asumamos que el repositorio devuelve entidades Municipio
    List<Municipio> municipios = municipioRepository.findByProvinciaIdProvinciaMunicipio(provinciaId);
    // Convertir a DTO
    return municipioMapper.fromEntityListToDto(municipios);
  }
}