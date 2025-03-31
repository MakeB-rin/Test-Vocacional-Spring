package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;


import Orientacion.Vocacional.IDRRU.Back.domain.entity.Provincia;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ProvinciaDto;
import java.util.List;

public interface ProvinciaService {
    List<Provincia> getAll();
    Provincia create(ProvinciaDto provinciaDto);
    Provincia getById(Integer id);
    void delete(Integer id);

    void changeState(Integer id);

    Provincia update(Integer id, ProvinciaDto provinciaDto);
}
