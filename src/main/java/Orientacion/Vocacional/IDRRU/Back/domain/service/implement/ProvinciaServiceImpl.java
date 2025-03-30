package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.ProvinciaRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Provincia;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.ProvinciaMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ProvinciaService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
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
    public Provincia create(ProvinciaDto provinciaDto) {
        Provincia provincia = provinciaMapper.fromDtoToEntity(provinciaDto, null );
        return provinciaRepository.save(provincia);
    }

    @Override
    public Provincia getById(Integer id) {
        return provinciaRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Provincia" , id));
    }
}
