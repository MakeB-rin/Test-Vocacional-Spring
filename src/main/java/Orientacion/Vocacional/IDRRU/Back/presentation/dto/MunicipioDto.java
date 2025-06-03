package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MunicipioDto {


  private Integer idMunicipio;

  @NotBlank(message = "El nombre NO debe ser blanco")
  @Size(min = 1, max = 200, message = "el nombre debe tener entre 2-198 caracteres")
  private String nombre;

  @NotNull(message = "Debe incluir el id provincia")
  private Integer idProvincia;

}
