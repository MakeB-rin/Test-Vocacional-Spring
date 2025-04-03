package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Estudiante;

import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.ProvinciaService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.EstudianteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EstudianteMapper {
    @Autowired
    ProvinciaService provinciaService;

    public Estudiante fromDtoToEntity(EstudianteDto dto, Estudiante estudiante) {
        Estudiante estudianteAux = new Estudiante( );
        if (estudiante != null) {
            estudianteAux = estudiante;
        }
        //seteo de los datos necesarios
        estudianteAux.setCiEstudiante(dto.getCiEstudiante());
        estudianteAux.setNombre(dto.getNombre());
        estudianteAux.setApPaterno(dto.getApPaterno());
        estudianteAux.setApPaterno(dto.getApMaterno());
        estudianteAux.setColegio(dto.getColegio());
        estudianteAux.setCurso(dto.getCurso());
        estudianteAux.setEdad(dto.getEdad());
        estudianteAux.setCelular(dto.getCelular());
        estudianteAux.setProvincia(provinciaService.getById(dto.getId_provincia()));

        return estudianteAux;
    }
}
