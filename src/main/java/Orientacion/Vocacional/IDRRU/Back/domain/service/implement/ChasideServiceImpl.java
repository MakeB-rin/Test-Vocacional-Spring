package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.ChasideRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Chaside;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.ChasideMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ChasideService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ChasideDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ChasideServiceImpl implements ChasideService {


    private ChasideRepository chasideRepository;

    @Autowired
    private ChasideMapper chasideMapper;

    @Override
    public Chaside getById(Integer id){
        return chasideRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Chaside", id));
    }

    @Override
    public List<Chaside> getAll(){
        return chasideRepository.findAll();
    }

    @Override
    public Chaside create(ChasideDto chasideDto){
        Chaside chaside = chasideMapper.fromDtoToEntity(chasideDto, null);
        return chasideRepository.save(chaside);
    }

}
