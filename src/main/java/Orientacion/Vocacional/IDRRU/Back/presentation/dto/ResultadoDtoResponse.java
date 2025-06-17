package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import lombok.*;

import java.util.Objects;


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

        // Aquí va la lógica Alternativa más compacta usando Objects.equals():
        if (fechaInicio != null && fechaFin != null) {
            this.fecha = Objects.equals(fechaInicio, fechaFin) ? fechaInicio : fechaInicio + "-" + fechaFin;
        } else if (fechaInicio != null) {
            this.fecha = fechaInicio;
        } else if (fechaFin != null) {
            this.fecha = fechaFin;
        } else {
            this.fecha = "Sin fecha";
        }

        this.cantidadEstudiantes = cantidadEstudiantes;
    }

}
