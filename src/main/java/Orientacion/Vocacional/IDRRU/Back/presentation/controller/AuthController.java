package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Usuario;
import Orientacion.Vocacional.IDRRU.Back.security.AuthService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.AuthDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador para manejar las peticiones de autenticacion.
 */
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<AuthDto.LoginResponse> iniciarSesion(@RequestBody AuthDto.LoginRequest request) {
        AuthDto.LoginResponse response = authService.iniciarSesion(request);
        return ResponseEntity.ok(response);
    }
    @PostMapping("/register")
    public ResponseEntity<Usuario> registrar(@Valid @RequestBody AuthDto.RegisterRequest request) {
        Usuario usuario = authService.registrarUsuario(request);
        return ResponseEntity.ok(usuario);
    }
    @PostMapping("/logout")
    public ResponseEntity<Void> cerrarSesion(@RequestHeader("Authorization") String token) {
        authService.cerrarSesion(token);
        return ResponseEntity.ok().build();
    }
}