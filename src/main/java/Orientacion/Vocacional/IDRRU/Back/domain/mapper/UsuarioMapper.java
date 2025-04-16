package Orientacion.Vocacional.IDRRU.Back.domain.mapper;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Usuario;
import Orientacion.Vocacional.IDRRU.Back.presentation.dto.UsuarioDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * Mapper para convertir entre Usuario y UsuarioDto.
 */
@Component
@RequiredArgsConstructor
public class UsuarioMapper {

    private final PasswordEncoder passwordEncoder;

    /**
     * Convierte un DTO a una entidad Usuario.
     * @param dto Objeto DTO de Usuario.
     * @param usuario Instancia existente o null para crear una nueva.
     * @return Objeto Usuario.
     */
    public Usuario fromDtoToEntity(UsuarioDto dto, Usuario usuario) {
        Usuario usuarioAux = (usuario != null) ? usuario : new Usuario();
        usuarioAux.setUsername(dto.getUsername());

        // Solo encriptar la contraseña si se proporciona una nueva
        if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
            usuarioAux.setPassword(passwordEncoder.encode(dto.getPassword()));
        }

        usuarioAux.setNombre(dto.getNombre());
        usuarioAux.setApellido(dto.getApellido());
        usuarioAux.setEmail(dto.getEmail());

        // Asignar rol si se especifica, sino establecer uno por defecto
        if (dto.getRol() != null && !dto.getRol().isEmpty()) {
            usuarioAux.setRol(dto.getRol());
        } else if (usuario == null) {
            usuarioAux.setRol("USER");
        }

        return usuarioAux;
    }

    /**
     * Convierte una entidad Usuario a un DTO.
     * @param usuario Entidad Usuario.
     * @return Objeto DTO de Usuario.
     */
    public UsuarioDto fromEntityToDto(Usuario usuario) {
        if (usuario == null) {
            return null;
        }

        return new UsuarioDto(
                usuario.getIdUsuario(),
                usuario.getUsername(),
                null, // No se expone la contraseña en el DTO
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getEmail(),
                usuario.getRol()
        );
    }
}
