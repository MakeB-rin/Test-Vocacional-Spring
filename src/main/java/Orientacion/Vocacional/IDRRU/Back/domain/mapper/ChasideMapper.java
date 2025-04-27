package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Chaside;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.ChasideDto;
import org.springframework.stereotype.Component;

@Component
public class ChasideMapper {

    public Chaside fromDtoToEntity(ChasideDto dto, Chaside chaside) {
        Chaside chasideAux = new Chaside ();

        if (chaside != null) {
            chasideAux = chaside;
        }

        //seteo de los datos necesarios
        chasideAux.setCodigo(dto.getCodigo());

        return chasideAux;
    }

}
