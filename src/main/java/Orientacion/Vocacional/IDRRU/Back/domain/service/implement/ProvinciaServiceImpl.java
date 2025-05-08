package Orientacion.Vocacional.IDRRU.Back.domain.service.implement;

import Orientacion.Vocacional.IDRRU.Back.data.repository.ProvinciaRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Provincia;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ProvinciaService;
import Orientacion.Vocacional.IDRRU.Back.exception.EntityNotFoundException;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProvinciaServiceImpl implements ProvinciaService {

    private ProvinciaRepository provinciaRepository;


    @Override
    public List<Provincia> getAll() {
        return provinciaRepository.findAll();
    }

    @Override
    public Provincia getById(Integer id) {
        return provinciaRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Provincia", id));
    }
}
