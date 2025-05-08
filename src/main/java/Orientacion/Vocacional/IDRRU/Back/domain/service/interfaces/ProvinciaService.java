package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Provincia;
import java.util.List;

public interface ProvinciaService {

    Provincia getById(Integer id);

    List<Provincia> getAll();
}