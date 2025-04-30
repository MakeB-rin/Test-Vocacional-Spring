package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultadoDto {

    private Integer idResultado;

    @NotNull(message = "El interes no puede ser nulo")
    private Integer interes;

    @NotNull(message = "La aptitud no puede ser nula")
    private Integer aptitud;

    @NotBlank(message = "El puntaje Holland no debe ser blanco")
    private String puntajeHolland;

    private String fecha;

    @NotNull(message = "El id del estudiante es requerido")
    private Integer idEstudiante;

    @NotNull(message = "El id del chaside es requerido")
    private Integer idChaside;

    @NotNull(message = "El id del holland es requerido")
    private Integer idHolland;

    @NotNull(message = "El id de la facultad es requerido")
    private Integer idFacultad;

}