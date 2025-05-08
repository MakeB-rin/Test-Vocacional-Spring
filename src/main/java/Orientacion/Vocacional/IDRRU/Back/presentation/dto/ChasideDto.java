package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ChasideDto {

    private Integer idChaside;

    @NotBlank(message = "El codigo NO debe ser blanco")
    @Size(min = 1, max = 200, message = "el codigo debe tener entre 2-198 caracteres")
    private String codigo;

}
