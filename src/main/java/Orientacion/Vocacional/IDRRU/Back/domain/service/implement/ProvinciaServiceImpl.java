package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.ProvinciaRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Provincia;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.MunicipioMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.ProvinciaMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ProvinciaService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import java.util.List;

import Orientacion.Vocacional.IDRRU.Back.presentation.dto.MunicipioDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ProvinciaDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProvinciaServiceImpl implements ProvinciaService {

    private ProvinciaRepository provinciaRepository;

    @Autowired
    private ProvinciaMapper provinciaMapper;

    @Override
    public List<ProvinciaDto> getAll() {
        List<Provincia> provinciaList = provinciaRepository.findAll();
        return provinciaMapper.fromEntityListToDto(provinciaList);
    }

    @Override
    public ProvinciaDto getById(Integer id) {
        Provincia provincia = provinciaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Provincia", id));
        return provinciaMapper.fromEntityToDto(provincia);
    }


}
