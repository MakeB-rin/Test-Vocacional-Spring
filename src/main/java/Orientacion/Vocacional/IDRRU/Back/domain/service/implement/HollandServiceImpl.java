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
    public Holland getById(Integer id){
        return hollandRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Holland", id));
    }

    @Override
    public List<Holland> getAll(){
        return hollandRepository.findAll();
    }

    @Override
    public Holland create(HollandDto hollandDto){
        Holland holland = hollandMapper.fromDtoToEntity(hollandDto, null);
        return hollandRepository.save(holland);
    }

}
