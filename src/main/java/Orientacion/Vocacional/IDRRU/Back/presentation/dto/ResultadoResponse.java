package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ResultadoResponse {


    private String municipio;

    private String facultad;

    private Long cantidadEstudiantes;


}