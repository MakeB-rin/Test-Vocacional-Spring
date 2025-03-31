package Orientacion.Vocacional.IDRRU.Back.presentation.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MunicipioDto {
  @NotBlank(message = "El nombre NO debe ser blanco")
  @Size(min = 1, max = 200, message = "el nombre debe tener entre 2-198 caracteres")
  private String Nombre;
}
