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


    private HollandRepository hollandRepository;

    @Autowired
    private HollandMapper hollandMapper;

    @Override
    public HollandDto getById(Integer id){
        Holland holland = hollandRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Holland", id));
        return hollandMapper.fromEntityToDto(holland);
    }

    @Override
    public List<HollandDto> getAll(){
        List<Holland> holland = hollandRepository.findAll();
        return hollandMapper.fromEntityListToDto(holland);
    }

    @Override
    public HollandDto create(HollandDto hollandDto){
        Holland holland = hollandMapper.fromDtoToEntity(hollandDto, null);
        Holland hollandSave = hollandRepository.save(holland);
        return hollandMapper.fromEntityToDto(hollandSave);
    }

}
