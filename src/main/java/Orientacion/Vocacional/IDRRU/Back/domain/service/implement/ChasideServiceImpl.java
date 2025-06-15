package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.ChasideRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Chaside;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.ChasideMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ChasideService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ChasideDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ChasideServiceImpl implements ChasideService {

    private final ChasideRepository chasideRepository;
    private final ChasideMapper chasideMapper;

    @Override
    public ChasideDto findById(Integer id) {
        Chaside chaside = chasideRepository.findById(id).
                orElseThrow(() -> new EntityNotFoundException("Chaside no encontrado con id " + id));
        return chasideMapper.fromEntityToDto(chaside);
    }

    @Override
    public List<ChasideDto> findAll() {
        List<Chaside> chasideList = chasideRepository.findAll();
        return chasideMapper.fromEntityListToDto(chasideList);
    }
}