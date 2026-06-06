package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.ColegioRepository;
import Orientacion.Vocacional.IDRRU.Back.data.repository.MunicipioRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Colegio;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.ColegioMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ColegioService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ColegioDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class ColegioServiceImpl implements ColegioService {

    private final ColegioRepository colegioRepository;
    private final MunicipioRepository municipioRepository;
    private final ColegioMapper colegioMapper;

    @Override
    public ColegioDto getById(Integer Id) {
        Colegio colegio = colegioRepository.findById(Id).orElseThrow( ()-> new EntityNotFoundException("Colegio", Id));
        return colegioMapper.fromEntityToDto(colegio);
    }

    @Override
    public List<ColegioDto> getAll() {
        List<Colegio> colegioList = colegioRepository.findAll();
        return colegioMapper.fromEntityListToDto(colegioList);
    }

    @Override
    public ColegioDto create (ColegioDto dto) {
        Municipio municipio = municipioRepository
                .findById(dto.getIdMunicipio())
                .orElseThrow(() ->
                            new EntityNotFoundException("Municipio", dto.getIdMunicipio()));

        Colegio colegio = colegioMapper.fromDtoToEntity(dto, null);
        colegio.setMunicipio(municipio);
        Colegio saved = colegioRepository.save(colegio);
        return colegioMapper.fromEntityToDto(saved);
    }

    @Override
    public ColegioDto update(Integer Id, ColegioDto dto) {
        Colegio colegio = colegioRepository
                .findById(Id)
                .orElseThrow(()->
                        new EntityNotFoundException("Colegio", dto.getIdColegio()));
        Municipio municipio = municipioRepository
                .findById(dto.getIdMunicipio())
                .orElseThrow(()->
                        new EntityNotFoundException("Municipio", dto.getIdMunicipio()));
        colegio = colegioMapper.fromDtoToEntity(dto, colegio);
        colegio.setMunicipio(municipio);
        Colegio updated = colegioRepository.save(colegio);
        return colegioMapper.fromEntityToDto(updated);
    }

    @Override
    public void delete(Integer Id) {
        if (!colegioRepository.existsById(Id)){
            throw new EntityNotFoundException("Colegio", Id);
        }
        colegioRepository.deleteById(Id);
    }
}
