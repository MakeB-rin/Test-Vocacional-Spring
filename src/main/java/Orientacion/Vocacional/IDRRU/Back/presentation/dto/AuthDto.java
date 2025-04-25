package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO para datos relacionados con autenticacion y registro.
 */
public class AuthDto {

    /**
     * Representa la solicitud de inicio de sesion.
     */
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class LoginRequest {
        private String username;
        private String password;
    }

    /**
     * Representa la respuesta despues de un inicio de sesion exitoso.
     */
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class LoginResponse {
        private String token;
        private String username;
        private String nombre;
        private String rol;
    }

    /**
     * Representa la solicitud para registrar un nuevo usuario.
     */
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class RegisterRequest {
        private String username;
        private String password;
        private String nombre;
        private String apellido;
        private String email;
    }
}