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

    public ResultadoDtoResponse(String provincia, String municipio, String chaside,
                                String fechaInicio, String fechaFin, Long cantidadEstudiantes) {
        this.provincia = provincia;
        this.municipio = municipio;
        this.chaside = chaside;

        // Aquí va la lógica que preguntabas:
        this.fecha = fechaInicio.equals(fechaFin) ? fechaInicio : fechaInicio + "-" + fechaFin;

        this.cantidadEstudiantes = cantidadEstudiantes;
    }

}
