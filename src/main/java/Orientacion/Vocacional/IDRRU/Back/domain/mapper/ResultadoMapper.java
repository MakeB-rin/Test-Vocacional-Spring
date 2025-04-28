package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.*;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ResultadoDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResultadoMapper {

    public Resultado fromDtoToEntity(ResultadoDto dto, Resultado resultado) {

        Resultado resultadoAux = (resultado != null) ? resultado : new Resultado();

        resultadoAux.setInteres(dto.getInteres());
        resultadoAux.setAptitud(dto.getAptitud());
        resultadoAux.setPuntajeHolland(dto.getPuntajeHolland());
        //No editar el año
        //resultadoAux.setFecha(dto.getFecha());

        Estudiante estudiante = new Estudiante();
        estudiante.setIdEstudiante(dto.getIdEstudiante());
        resultadoAux.setEstudiante(estudiante);

        Chaside chaside = new Chaside();
        chaside.setIdChaside(dto.getIdChaside());
        resultadoAux.setChaside(chaside);

        Holland holland = new Holland();
        holland.setIdHolland(dto.getIdHolland());
        resultadoAux.setHolland(holland);

        Facultad facultad = new Facultad();
        facultad.setIdFacultad(dto.getIdFacultad());
        resultadoAux.setFacultad(facultad);

        return resultadoAux;
    }

    // Metodo opcional para convertir entidad a DTO
    public ResultadoDto fromEntityToDto(Resultado resultado) {
        if (resultado == null) {
            return null;
        }
        ResultadoDto dto = new ResultadoDto();

        dto.setIdResultado(resultado.getIdResultado());
        dto.setInteres(resultado.getInteres());
        dto.setAptitud(resultado.getAptitud());
        dto.setPuntajeHolland(resultado.getPuntajeHolland());
        dto.setFecha(resultado.getFecha());
        // Se asignan los IDs de las relaciones
        dto.setIdEstudiante(resultado.getEstudiante() != null ? resultado.getEstudiante().getIdEstudiante() : null);
        dto.setIdChaside(resultado.getChaside() != null ? resultado.getChaside().getIdChaside() : null);
        dto.setIdHolland(resultado.getHolland() != null ? resultado.getHolland().getIdHolland() : null);
        dto.setIdFacultad(resultado.getFacultad() != null ? resultado.getFacultad().getIdFacultad() : null);
        return dto;
    }























    public List<ResultadoDto> fromEntityListToDtoList(List<Resultado> resultadoList) {
        List<ResultadoDto> resultadoDtoList = new ArrayList<>();
        for(Resultado resultado : resultadoList){

            ResultadoDto resultadoDto = new ResultadoDto();

            resultadoDto.setIdResultado(resultado.getIdResultado());
            resultadoDto.setAptitud(resultado.getAptitud());
            resultadoDto.setInteres(resultado.getInteres());
            resultadoDto.setFecha(resultado.getFecha());
            resultadoDto.setPuntajeHolland(resultado.getPuntajeHolland());
            if(resultado.getEstudiante() != null){
                resultadoDto.setIdEstudiante(resultado.getEstudiante().getIdEstudiante());
            }
            if(resultado.getChaside() != null){
                resultadoDto.setIdChaside(resultado.getChaside().getIdChaside());
            }
            if(resultado.getHolland() != null){
                resultadoDto.setIdEstudiante(resultado.getHolland().getIdHolland());
            }
            if(resultado.getFacultad() != null){
                resultadoDto.setIdEstudiante(resultado.getFacultad().getIdFacultad());
            }

            resultadoDtoList.add(resultadoDto);
        }
        return resultadoDtoList;
    }




}