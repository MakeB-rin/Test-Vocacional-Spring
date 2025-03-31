package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.ProvinciaRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Provincia;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.ProvinciaMapper;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ProvinciaService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ProvinciaDto;
import jakarta.transaction.Transactional;
import java.util.List;
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
    public List<Provincia> getAll() {
        return provinciaRepository.findAll();
    }

    @Override
    public Provincia create(ProvinciaDto provinciaDto) {
        Provincia provincia = provinciaMapper.fromDtoToEntity(provinciaDto, null);
        return provinciaRepository.save(provincia);
    }

    @Override
    public Provincia getById(Integer id) {
        return provinciaRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Provincia", id));
    }

    //eliminacion FISICA
    @Transactional
    @Override
    public void delete(Integer id) {

        provinciaRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Provincia", id));
        provinciaRepository.deleteById(id);
    }

    //eliminacion LOGICA
    @Override
    public void changeState(Integer id) {

        Provincia provincia = provinciaRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Provincia", id));
        provincia.active= provincia.active? false: true;
        provinciaRepository.save(provincia);
    }

    @Override
    public Provincia update(Integer id, ProvinciaDto provinciaDto) {
        Provincia provinciaFound = provinciaRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Provincia", id));
        Provincia provinciaToSave = provinciaMapper.fromDtoToEntity(provinciaDto, provinciaFound);

        return provinciaRepository.save(provinciaToSave);
    }
}
