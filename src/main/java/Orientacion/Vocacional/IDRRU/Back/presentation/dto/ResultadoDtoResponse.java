package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ResultadoDtoResponse {

    private String provincia;

    private String municipio;

    private String chaside;

    private String fecha;

    private Long cantidadEstudiantes;



}
