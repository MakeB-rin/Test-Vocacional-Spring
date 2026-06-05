package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.ColegioRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Colegio;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.ColegioMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ColegioService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ColegioDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ColegioServiceImpl implements ColegioService {

    private ColegioRepository colegioRepository;

    @Autowired
    private ColegioMapper colegioMapper;

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

}
