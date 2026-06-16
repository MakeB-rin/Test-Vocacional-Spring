package Orientacion.Vocacional.IDRRU.Back.security;

import Orientacion.Vocacional.IDRRU.Back.data.repository.UsuarioRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Usuario;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.AuthDto;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.UsuarioDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
                .rol(usuario.getRol().name())
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
        usuario.setRol(Usuario.Rol.valueOf(request.getRol().toUpperCase()));
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

    /**
     * Lista a todos los usuarios en el sistema.
     *
     * @return Los usuarios registrados.
     */
    public List<AuthDto.UsuarioResponse> getAll() {
        return usuarioRepository.findAll()
                .stream()
                .map(usuario ->
                        AuthDto.UsuarioResponse.builder()
                                .idUsuario(usuario.getIdUsuario())
                                .username(usuario.getUsername())
                                .nombre(usuario.getNombre())
                                .rol(usuario.getRol().name())
                                .build()
                        )
                        .toList();
    }

    /**
     * Retorna un usuario con el id.
     *
     * @param idUsuario di del usuario a buscar.
     */
    public AuthDto.UsuarioResponse getById(Integer idUsuario) {
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() ->
                        new RuntimeException("Usuario no encontrado"));
        return AuthDto.UsuarioResponse.builder()
                .idUsuario(usuario.getIdUsuario())
                .nombre(usuario.getNombre())
                .username(usuario.getUsername())
                .rol(usuario.getRol().name())
                .build();
    }

    /**
     * Actualiza los datos de un usuario.
     *
     * @param idUsuario el id del Usuario que se quiere actualizar ").
     * @param request toda la informacion del usuario actualizada ").
     */
    public AuthDto.UsuarioResponse update(Integer idUsuario, AuthDto.UpdateRequest request){
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() ->
                        new RuntimeException("Usuario no encontrado"));

        Optional<Usuario> existente = usuarioRepository.findByUsername(request.getUsername());

        if (existente.isPresent() && !existente.get().getIdUsuario().equals(idUsuario)){
            throw new RuntimeException("El nombre de usuario ya esta en uso");
        }

        usuario.setUsername(request.getUsername());
        usuario.setNombre(request.getNombre());
        usuario.setRol(Usuario.Rol.valueOf(request.getRol().toUpperCase()));

        if (request.getPassword() != null && !request.getPassword().isBlank()){
            usuario.setPassword(
                    passwordEncoder.encode(request.getPassword())
            );
        }

        return AuthDto.UsuarioResponse.builder()
                .idUsuario(usuario.getIdUsuario())
                .nombre(usuario.getNombre())
                .username(usuario.getUsername())
                .rol(usuario.getRol().name())
                .build();
    }

    /**
     * Borra un usuario completamente.
     *
     * @param idUsuario el id del Usuario que se quiere borrar ").
     */
    public void delete(Integer idUsuario){
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() ->
                        new RuntimeException("Usuario no encontrado"));
        usuarioRepository.delete(usuario);
    }
}