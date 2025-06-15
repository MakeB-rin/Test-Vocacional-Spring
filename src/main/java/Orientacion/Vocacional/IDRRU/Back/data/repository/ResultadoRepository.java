package Orientacion.Vocacional.IDRRU.Back.data.repository;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Resultado;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDtoResponse;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Repository
public interface  ResultadoRepository extends GenericRepository<Resultado, Integer>{

    //JPQL -> Entidades


    // Muestra en general por cada municipio la cantidad de estudiantes por facultad de respuesta
    @Query("""
    SELECT new Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDtoResponse(
      p.nombre, m.nombre, c.codigo, :fechaInicio, :fechaFin, COUNT(distinct r.estudiante.idEstudiante))
      FROM Resultado r
      JOIN r.estudiante e
      JOIN e.municipio m
      JOIN m.provincia p
      JOIN r.chaside c
      WHERE (:idProvincia IS NULL OR p.idProvincia  = :idProvincia)
      AND  (:idMunicipio IS NULL OR m.idMunicipio  = :idMunicipio)
      AND (:fechaInicio IS NULL OR r.fecha >= :fechaInicio) 
      AND (:fechaFin IS NULL OR r.fecha <= :fechaFin)  
      GROUP BY p.nombre, m.nombre, c.codigo
      ORDER BY m.nombre, c.codigo""")
    List<ResultadoDtoResponse> busquedaProvinciaList(@Param("idProvincia") Long idProvincia,
                                                     @Param("idMunicipio") Long idMunicipio,
                                                     @Param("fechaInicio") String fechaInicio,
                                                     @Param("fechaFin") String fechaFin);

    @Query("""
        SELECT DISTINCT r.fecha
        FROM Resultado r
        JOIN r.estudiante e
        JOIN e.municipio m
        JOIN m.provincia p
        WHERE (:idProvincia IS NULL OR p.idProvincia = :idProvincia)
        AND (:idMunicipio IS NULL OR m.idMunicipio = :idMunicipio)
        ORDER BY r.fecha
        """)
    List<String> obtenerListaAniosDisponibles(@Param("idProvincia") Long idProvincia,
                                         @Param("idMunicipio") Long idMunicipio);





    // Muestra en general por cada municipio la cantidad de estudiantes por facultad de respuesta
//    @Query("""
//    SELECT new Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDtoResponse(
//      p.nombre, m.nombre, c.codigo, r.fecha, COUNT(distinct r.estudiante.idEstudiante))
//      FROM Resultado r
//      JOIN r.estudiante e
//      JOIN e.municipio m
//      JOIN m.provincia p
//      JOIN r.chaside c
//      WHERE (:idProvincia IS NULL OR p.idProvincia  = :idProvincia)
//      AND  (:idMunicipio IS NULL OR m.idMunicipio  = :idMunicipio)
//      AND (:year IS NULL OR r.fecha = :year)
//      GROUP BY p.nombre, m.nombre, c.codigo,r.fecha
//      ORDER BY m.nombre, c.codigo, r.fecha""")
//    List<ResultadoDtoResponse> busquedaProvinciaList(@Param("idProvincia") Long idProvincia,
//                                                     @Param("idMunicipio") Long idMunicipio,
//                                                     @Param("year") String year);

    List<Resultado> findAllByEstudianteIdEstudiante(Integer idEstudiante);
//
//    @Query("""
//    SELECT new Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDtoResponse(
//      p.nombre, m.nombre, c.codigo, r.fecha, COUNT(distinct r.estudiante.idEstudiante))
//      FROM Resultado r
//      JOIN r.estudiante e
//      JOIN e.municipio m
//      JOIN m.provincia p
//      JOIN r.chaside c
//      WHERE p.idProvincia  = :idProvincia
//      AND (:year IS NULL OR r.fecha = :year)
//      GROUP BY p.nombre, m.nombre, c.codigo,r.fecha
//      ORDER BY m.nombre, c.codigo, r.fecha""")
//    List<ResultadoDtoResponse> busquedaProvinciaList(@Param("idProvincia") Long idProvincia,
//                                                     @Param("year") String year);

}
