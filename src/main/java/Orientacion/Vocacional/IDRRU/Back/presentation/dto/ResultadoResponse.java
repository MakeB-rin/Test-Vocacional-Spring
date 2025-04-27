package Orientacion.Vocacional.IDRRU.Back.presentation.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor
@Builder
public class ResultadoResponse {

    private Integer municipioId;

    private String nombre;

    private Integer cantidadEstudiantes;


}
