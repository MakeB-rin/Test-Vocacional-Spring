package Orientacion.Vocacional.IDRRU.Back.security;

import Orientacion.Vocacional.IDRRU.Back.data.repository.UsuarioRepository;
import Orientacion.Vocacional.IDRRU.Back.domain.entity.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;


/**
 * Servicio que implementa UserDetailsService para cargar usuarios.
 */
@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    /**
     * Busca y carga los detalles de un usuario por su nombre de usuario.
     *
     * @param username El nombre de usuario a buscar.
     * @return UserDetails que representa al usuario.
     * @throws UsernameNotFoundException si el usuario no es encontrado.
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + username));

        return new User(
                usuario.getUsername(),
                usuario.getPassword(),
                Collections.emptyList()
        );
    }
}