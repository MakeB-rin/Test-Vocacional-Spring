package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.AuthService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.AuthDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.UsuarioDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para endpoints de autenticacion y registro.
 * Maneja solicitudes relacionadas con "/auth".
 */
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    /**
     * Endpoint para iniciar sesion.
     *
     * @param request Cuerpo de la solicitud con credenciales (usuario y contrasena).
     * @return ResponseEntity con la respuesta de login, incluyendo el token JWT.
     */
    @PostMapping("/login")
    public ResponseEntity<AuthDto.LoginResponse> login(@RequestBody AuthDto.LoginRequest request) {
        AuthDto.LoginResponse response = authService.login(request);
        return ResponseEntity.ok(response);
    }

    /**
     * Endpoint para registrar un nuevo usuario.
     *
     * @param request Cuerpo de la solicitud con datos del nuevo usuario.
     * @return ResponseEntity con el DTO del usuario registrado.
     */
    @PostMapping("/register")
    public ResponseEntity<UsuarioDto> register(@Valid @RequestBody AuthDto.RegisterRequest request) {
        UsuarioDto usuario = authService.register(request);
        return ResponseEntity.ok(usuario);
    }

    /**
     * Endpoint para cerrar sesion.
     * Invalida el token JWT.
     *
     * @param token El token JWT proporcionado en el encabezado "Authorization".
     * @return ResponseEntity vacio con estado OK.
     */
    @PostMapping("/logout")
    public ResponseEntity<Void> logout(@RequestHeader("Authorization") String token) {
        authService.logout(token);
        return ResponseEntity.ok().build();
    }
}