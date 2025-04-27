package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para datos relacionados con autenticacion y registro.
 */
public class AuthDto {

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class LoginRequest {
        private String username;
        private String password;
    }
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class LoginResponse {
        private String token;
        private String username;
        private String nombre;
    }
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class RegisterRequest {
        @NotBlank(message = "El nombre de usuario no debe estar en blanco")
        @Size(min = 3, max = 50, message = "El nombre de usuario debe tener entre 3 y 50 caracteres")
        private String username;

        @NotBlank(message = "La contrasena no debe estar en blanco")
        @Size(min = 4, message = "La contrasena debe tener al menos 4 caracteres")
        private String password;

        @NotBlank(message = "El nombre no debe estar en blanco")
        private String nombre;
    }
}