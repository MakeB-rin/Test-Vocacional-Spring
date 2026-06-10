package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.data.repository.ColegioRepository;
import Orientacion.Vocacional.IDRRU.Back.data.repository.MunicipioRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Colegio;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Municipio;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EstudianteDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class EstudianteMapper {

    private final MunicipioRepository municipioRepository;
    private final ColegioRepository colegioRepository;

    public Estudiante fromDtoToEntity(EstudianteDto dto, Estudiante estudiante) {
        Estudiante estudianteAux = new Estudiante();
        if (estudiante != null) {
            estudianteAux = estudiante;
        }
        if (dto.getId_municipio() != null){
            Municipio municipio = municipioRepository.findById(dto.getId_municipio())
                    .orElseThrow(()->
                            new RuntimeException("Municipio no encontrado"));
            estudianteAux.setMunicipio(municipio);
        }
        if (dto.getIdColegio() != null){
            Colegio colegio = colegioRepository.findById(dto.getIdColegio())
                    .orElseThrow(()->
                            new RuntimeException("Colegio no encontrado"));
            estudianteAux.setColegio(colegio);
        }
        estudianteAux.setCiEstudiante(dto.getCiEstudiante());
        estudianteAux.setNombre(dto.getNombre());
        estudianteAux.setApPaterno(dto.getApPaterno());
        estudianteAux.setApMaterno(dto.getApMaterno());
        estudianteAux.setNombreColegio(dto.getNombreColegio());
        estudianteAux.setCurso(dto.getCurso());
        estudianteAux.setEdad(dto.getEdad());
        estudianteAux.setCelular(dto.getCelular());

        return estudianteAux;
    }

    public EstudianteDto fromEntityToDto(Estudiante estudiante){
        EstudianteDto estudianteDto = new EstudianteDto();

        estudianteDto.setIdEstudiante(estudiante.getIdEstudiante());
        estudianteDto.setCiEstudiante(estudiante.getCiEstudiante());
        estudianteDto.setNombre(estudiante.getNombre());
        estudianteDto.setApPaterno(estudiante.getApPaterno());
        estudianteDto.setApMaterno(estudiante.getApMaterno());
        estudianteDto.setNombreColegio(estudiante.getNombreColegio());
        estudianteDto.setCurso(estudiante.getCurso());
        estudianteDto.setEdad(estudiante.getEdad());
        estudianteDto.setCelular(estudiante.getCelular());

        estudianteDto.setCreatedAt(estudiante.getCreatedAt());
        estudianteDto.setUpdatedAt(estudiante.getUpdatedAt());

        if(estudiante.getColegio() != null){
            estudianteDto.setIdColegio(estudiante.getColegio().getIdColegio());
        }
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
            // estudianteDto.setColegio(estudianteAux.getColegio());
            estudianteDto.setCurso(estudianteAux.getCurso());
            estudianteDto.setEdad(estudianteAux.getEdad());
            estudianteDto.setCelular(estudianteAux.getCelular());

            estudianteDto.setCreatedAt(estudianteAux.getCreatedAt());
            estudianteDto.setUpdatedAt(estudianteAux.getUpdatedAt());

            if(estudianteAux.getColegio() != null){
                estudianteDto.setIdColegio(estudianteAux.getColegio().getIdColegio());
            }

            if(estudianteAux.getMunicipio() != null){
                estudianteDto.setId_municipio(estudianteAux.getMunicipio().getIdMunicipio());
            }
            estudianteDtos.add(estudianteDto);
        }


        return estudianteDtos;
    }

}
