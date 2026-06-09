package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EvaluacionResponseDto {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String colegio;
    private Integer puntajeInteres;
    private Integer puntajeAptitud;
    private String holland;
    private String chaside;
    private String celular;
    private String curso;
    private Integer edad;
    private String provincia;
    private String municipio;
}
