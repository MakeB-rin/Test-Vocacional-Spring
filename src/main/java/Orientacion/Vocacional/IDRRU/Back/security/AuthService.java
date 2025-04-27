package Orientacion.Vocacional.IDRRU.Back.security;

import Orientacion.Vocacional.IDRRU.Back.data.repository.UsuarioRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Usuario;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.AuthDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Date;

/**
 * Servicio para autenticacion de usuarios.
 * Maneja operaciones de inicio de sesion, registro y cierre de sesion.
 */
@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenBlacklistService tokenBlacklistService;

    /**
     * Realiza el proceso de inicio de sesion.
     *
     * @param request Datos de la solicitud de login (usuario y contrasena).
     * @return Respuesta con el token JWT y datos del usuario.
     */
    public AuthDto.LoginResponse iniciarSesion(AuthDto.LoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );
        UserDetails user = (UserDetails) authentication.getPrincipal();
        String token = jwtUtil.generarToken(user);

        Usuario usuario = usuarioRepository.findByUsername(user.getUsername())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado despues de autenticacion"));

        return AuthDto.LoginResponse.builder()
                .token(token)
                .username(usuario.getUsername())
                .nombre(usuario.getNombre())
                .build();
    }

    /**
     * Registra un nuevo usuario en el sistema.
     *
     * @param request Datos de la solicitud de registro.
     * @return El usuario registrado.
     */
    public Usuario registrarUsuario(AuthDto.RegisterRequest request) {
        if (usuarioRepository.existsByUsername(request.getUsername())) {
            throw new RuntimeException("El nombre de usuario ya esta en uso");
        }

        Usuario usuario = new Usuario();
        usuario.setUsername(request.getUsername());
        usuario.setPassword(passwordEncoder.encode(request.getPassword()));
        usuario.setNombre(request.getNombre());

        return usuarioRepository.save(usuario);
    }

    /**
     * Invalida un token JWT para cerrar sesion.
     *
     * @param token El token JWT a invalidar (puede incluir "Bearer ").
     */
    public void cerrarSesion(String token) {
        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        Date expirationDate = jwtUtil.extraerExpiracion(token);
        Long expirationTimeMillis = expirationDate.getTime();
        tokenBlacklistService.blacklistToken(token, expirationTimeMillis);

    }
}