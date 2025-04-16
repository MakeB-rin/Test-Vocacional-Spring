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

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;
    private final TokenBlacklistService tokenBlacklistService;

    public AuthDto.LoginResponse login(AuthDto.LoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );

        UserDetails user = (UserDetails) authentication.getPrincipal();
        String token = jwtUtil.generateToken(user);

        Usuario usuario = usuarioRepository.findByUsername(user.getUsername())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado después de autenticación"));

        return AuthDto.LoginResponse.builder()
                .token(token)
                .username(usuario.getUsername())
                .nombre(usuario.getNombre())
                .rol(usuario.getRol())
                .build();
    }

    public UsuarioDto register(AuthDto.RegisterRequest request) {
        if (usuarioRepository.existsByUsername(request.getUsername())) {
            throw new RuntimeException("El nombre de usuario ya está en uso");
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

    public void logout(String token) {
        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
        }
        tokenBlacklistService.blacklistToken(token);
    }
}