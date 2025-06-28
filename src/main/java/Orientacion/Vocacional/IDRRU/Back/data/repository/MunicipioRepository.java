package Orientacion.Vocacional.IDRRU.Back.data.repository;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Provincia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MunicipioRepository extends GenericRepository<Municipio, Integer>{

    @Query("SELECT m FROM Municipio m WHERE m.provincia.idProvincia = :provinciaId")
    List<Municipio> findByProvinciaIdProvinciaMunicipio(Integer provinciaId);


}
