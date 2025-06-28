package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para transferir datos de usuario.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
    private Integer idUsuario;

    @NotBlank(message = "El nombre de usuario no debe estar en blanco")
    @Size(min = 3, max = 50, message = "El nombre de usuario debe tener entre 3 y 50 caracteres")
    private String username;

    @NotBlank(message = "La contrasena no debe estar en blanco")
    @Size(min = 4, message = "La contrasena debe tener al menos 4 caracteres")
    private String password;

    @NotBlank(message = "El nombre no debe estar en blanco")
    @Size(min = 1, max = 100, message = "El nombre debe tener entre 1 y 100 caracteres")
    private String nombre;

}