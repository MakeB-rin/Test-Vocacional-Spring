package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Usuario;
import Orientacion.Vocacional.IDRRU.Back.security.AuthService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.AuthDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/users")
    public ResponseEntity<List<AuthDto.UsuarioResponse>> getAll() {
        return ResponseEntity.ok(authService.getAll());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<AuthDto.UsuarioResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(authService.getById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<AuthDto.UsuarioResponse> update(@PathVariable Integer id, @RequestBody AuthDto.UpdateRequest request) {
        return ResponseEntity.ok(authService.update(id, request));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        authService.delete(id);
        return ResponseEntity.noContent().build();
    }

}