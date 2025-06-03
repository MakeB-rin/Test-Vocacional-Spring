package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.HollandRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Holland;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.HollandMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.HollandService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.HollandDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HollandServiceImpl implements HollandService {

    private final HollandRepository hollandRepository;
    private final HollandMapper hollandMapper;

    @Override
    public HollandDto findById(Integer id) {
        Holland holland = hollandRepository.findById(id).
                orElseThrow(() -> new EntityNotFoundException("Holland no encontrado con id " + id));
        return hollandMapper.fromEntityToDto(holland);
    }

    @Override
    public List<HollandDto> findAll() {
        List<Holland> hollandList = hollandRepository.findAll();
        return hollandMapper.fromEntityListToDto(hollandList);
    }
}