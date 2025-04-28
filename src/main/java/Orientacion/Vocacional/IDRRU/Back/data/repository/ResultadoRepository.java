package Orientacion.Vocacional.IDRRU.Back.data.repository;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Resultado;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface  ResultadoRepository extends GenericRepository<Resultado, Integer>{

    //JPQL -> Entidades
    // Muestra en general por cada municipio la cantidad de estudiantes por facultad de respuesta
    @Query("""
     SELECT new Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoResponse( 
      m.nombre, f.nombre, COUNT(r.estudiante.idEstudiante))
     FROM Resultado r
     JOIN r.estudiante e
     JOIN e.municipio m
     JOIN r.facultad f
     GROUP BY m.nombre, f.nombre
     ORDER BY m.nombre""")
    List<ResultadoResponse> busquedaMunicipioList();



}
