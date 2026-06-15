package Orientacion.Vocacional.IDRRU.Back.data.repository;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Colegio;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColegioRepository extends GenericRepository<Colegio, Integer>{

    List<Colegio> findByMunicipioIdMunicipio(Integer idMunicipio);
}
