package Orientacion.Vocacional.IDRRU.Back.presentation.controller;

import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.AuthService;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.AuthDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.UsuarioDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<AuthDto.LoginResponse> login(@RequestBody AuthDto.LoginRequest request) {
        AuthDto.LoginResponse response = authService.login(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/register")
    public ResponseEntity<UsuarioDto> register(@Valid @RequestBody AuthDto.RegisterRequest request) {
        UsuarioDto usuario = authService.register(request);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping("/logout")
    public ResponseEntity<Void> logout(@RequestHeader("Authorization") String token) {
        authService.logout(token);
        return ResponseEntity.ok().build();
    }
}