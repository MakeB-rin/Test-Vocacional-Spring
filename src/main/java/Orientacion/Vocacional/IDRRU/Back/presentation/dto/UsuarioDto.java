package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import jakarta.validation.constraints.Email;
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
    /** ID unico del usuario. */
    private Integer idUsuario;

    /** Nombre de usuario, usado para login. */
    @NotBlank(message = "El nombre de usuario no debe estar en blanco")
    @Size(min = 3, max = 50, message = "El nombre de usuario debe tener entre 3 y 50 caracteres")
    private String username;

    /** Contrasena del usuario. */
    @NotBlank(message = "La contraseña no debe estar en blanco")
    @Size(min = 6, message = "La contraseña debe tener al menos 6 caracteres")
    private String password;

    /** Nombre completo del usuario. */
    @NotBlank(message = "El nombre no debe estar en blanco")
    @Size(min = 1, max = 100, message = "El nombre debe tener entre 1 y 100 caracteres")
    private String nombre;

    /** Apellido del usuario. */
    @Size(max = 100, message = "El apellido debe tener maximo 100 caracteres")
    private String apellido;

    /** Correo electronico del usuario. */
    @Email(message = "El email debe ser valido")
    @Size(max = 100, message = "El email debe tener maximo 100 caracteres")
    private String email;

    /** Rol del usuario (ej. ADMIN, USER). */
    private String rol;
}