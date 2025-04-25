package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import Orientacion.Vocacional.IDRRU.Back.data.repository.UsuarioRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Usuario;
import Orientacion.Vocacional.IDRRU.Back.domain.mapper.UsuarioMapper;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.AuthDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.UsuarioDto;
import Orientacion.Vocacional.IDRRU.Back.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * Servicio para operaciones de autenticacion y registro.
 */
@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;
    private final TokenBlacklistService tokenBlacklistService;

    /**
     * Realiza el proceso de inicio de sesion.
     *
     * @param request Datos de la solicitud de login (usuario y contrasena).
     * @return Respuesta con el token JWT y datos del usuario.
     */
    public AuthDto.LoginResponse login(AuthDto.LoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );

        UserDetails user = (UserDetails) authentication.getPrincipal();
        String token = jwtUtil.generateToken(user);

        Usuario usuario = usuarioRepository.findByUsername(user.getUsername())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado despues de autenticacion"));

        return AuthDto.LoginResponse.builder()
                .token(token)
                .username(usuario.getUsername())
                .nombre(usuario.getNombre())
                .rol(usuario.getRol())
                .build();
    }

    /**
     * Registra un nuevo usuario en el sistema.
     *
     * @param request Datos de la solicitud de registro.
     * @return El DTO del usuario registrado.
     */
    public UsuarioDto register(AuthDto.RegisterRequest request) {
        if (usuarioRepository.existsByUsername(request.getUsername())) {
            throw new RuntimeException("El nombre de usuario ya esta en uso");
        }

        UsuarioDto dto = new UsuarioDto(
                null,
                request.getUsername(),
                request.getPassword(),
                request.getNombre(),
                request.getApellido(),
                request.getEmail(),
                "ADMIN" // Rol por defecto
        );

        Usuario usuario = usuarioMapper.fromDtoToEntity(dto, null);
        Usuario savedUsuario = usuarioRepository.save(usuario);

        return usuarioMapper.fromEntityToDto(savedUsuario);
    }

    /**
     * Invalida un token JWT para cerrar sesion.
     *
     * @param token El token JWT a invalidar (puede incluir "Bearer ").
     */
    public void logout(String token) {
        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        tokenBlacklistService.blacklistToken(token);
    }
}