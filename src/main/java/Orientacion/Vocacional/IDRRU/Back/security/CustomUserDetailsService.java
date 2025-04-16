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

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    /**
     * Carga los detalles del usuario a partir del nombre de usuario.
     * Este metodo es utilizado por Spring Security durante la autenticación.
     *
     * @param username nombre de usuario.
     * @return detalles del usuario (UserDetails).
     * @throws UsernameNotFoundException si el usuario no existe.
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + username));

        // Se crea una instancia de User (propia de Spring Security)
        // con el nombre de usuario, la contraseña y los roles como autoridad.
        return new User(
                usuario.getUsername(),
                usuario.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + usuario.getRol()))
        );
    }
}
