package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;

import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.MunicipioService;
import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ProvinciaService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EstudianteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EstudianteMapper {

    @Autowired
    private MunicipioService municipioService;

    public Estudiante fromDtoToEntity(EstudianteDto dto, Estudiante estudiante) {
        Estudiante estudianteAux = new Estudiante();
        if (estudiante != null) {
            estudianteAux = estudiante;
        }
        estudianteAux.setCiEstudiante(dto.getCiEstudiante());
        estudianteAux.setNombre(dto.getNombre());
        estudianteAux.setApPaterno(dto.getApPaterno());
        estudianteAux.setApMaterno(dto.getApMaterno());
        estudianteAux.setColegio(dto.getColegio());
        estudianteAux.setCurso(dto.getCurso());
        estudianteAux.setEdad(dto.getEdad());
        estudianteAux.setCelular(dto.getCelular());
        estudianteAux.setMunicipio(municipioService.getById(dto.getId_municipio()));

        return estudianteAux;
    }

    public EstudianteDto fromEntityToDto(Estudiante estudiante){
        EstudianteDto estudianteDto = new EstudianteDto();

        estudianteDto.setIdEstudiante(estudiante.getIdEstudiante());
        estudianteDto.setCiEstudiante(estudiante.getCiEstudiante());
        estudianteDto.setNombre(estudiante.getNombre());
        estudianteDto.setApPaterno(estudiante.getApPaterno());
        estudianteDto.setApMaterno(estudiante.getApMaterno());
        estudianteDto.setColegio(estudiante.getColegio());
        estudianteDto.setCurso(estudiante.getCurso());
        estudianteDto.setEdad(estudiante.getEdad());
        estudianteDto.setCelular(estudiante.getCelular());

        estudianteDto.setCreatedAt(estudiante.getCreatedAt());
        estudianteDto.setUpdatedAt(estudiante.getUpdatedAt());

        if(estudiante.getMunicipio() != null){
            estudianteDto.setId_municipio(estudiante.getMunicipio().getIdMunicipio());
        }

        return estudianteDto;
    }

    public List<EstudianteDto> fromEntityListToDto(List<Estudiante> estudianteList){
        List<EstudianteDto> estudianteDtos = new ArrayList<>();
        for(Estudiante estudianteAux : estudianteList){
            EstudianteDto estudianteDto = new EstudianteDto();
            estudianteDto.setIdEstudiante(estudianteAux.getIdEstudiante());
            estudianteDto.setCiEstudiante(estudianteAux.getCiEstudiante());
            estudianteDto.setNombre(estudianteAux.getNombre());
            estudianteDto.setApPaterno(estudianteAux.getApPaterno());
            estudianteDto.setApMaterno(estudianteAux.getApMaterno());
            estudianteDto.setColegio(estudianteAux.getColegio());
            estudianteDto.setCurso(estudianteAux.getCurso());
            estudianteDto.setEdad(estudianteAux.getEdad());
            estudianteDto.setCelular(estudianteAux.getCelular());

            estudianteDto.setCreatedAt(estudianteAux.getCreatedAt());
            estudianteDto.setUpdatedAt(estudianteAux.getUpdatedAt());
            
            if(estudianteAux.getMunicipio() != null){
                estudianteDto.setId_municipio(estudianteAux.getMunicipio().getIdMunicipio());
            }
            estudianteDtos.add(estudianteDto);
        }


        return estudianteDtos;
    }

}
