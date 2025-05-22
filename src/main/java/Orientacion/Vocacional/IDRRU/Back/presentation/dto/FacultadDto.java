package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

// DTO para Facultad con validaciones
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FacultadDto {

    private Integer idFacultad;

    @NotBlank(message = "El código no debe ser blanco")
    @Size(min = 1, max = 50, message = "El código debe tener entre 1 y 50 caracteres")
    private String codigo;

    @NotBlank(message = "El nombre no debe ser blanco")
    @Size(min = 1, max = 200, message = "El nombre debe tener entre 1 y 200 caracteres")
    private String nombre;

    @NotNull(message = "Debe incluir el id chaside")
    private Integer idChaside;

}