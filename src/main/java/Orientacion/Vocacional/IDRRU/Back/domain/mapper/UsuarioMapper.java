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
     * @param dto Objeto DTO de Usuario con datos.
     * @param usuario Instancia de Usuario a actualizar o null para crear uno nuevo.
     * @return Objeto Usuario con los datos del DTO.
     */
    public Usuario fromDtoToEntity(UsuarioDto dto, Usuario usuario) {
        // Usa la instancia existente o crea una nueva
        Usuario usuarioAux = (usuario != null) ? usuario : new Usuario();

        usuarioAux.setUsername(dto.getUsername());

        // Solo encripta la contraseña si el DTO la tiene (no es nula y no esta vacia)
        if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
            usuarioAux.setPassword(passwordEncoder.encode(dto.getPassword()));
        }

        usuarioAux.setNombre(dto.getNombre());
        usuarioAux.setApellido(dto.getApellido());
        usuarioAux.setEmail(dto.getEmail());

        // Asigna el rol si se envia en el DTO, si no y es un usuario nuevo, asigna "USER"
        if (dto.getRol() != null && !dto.getRol().isEmpty()) {
            usuarioAux.setRol(dto.getRol());
        } else if (usuario == null) { // Si es una nueva entidad y no se paso rol en DTO
            usuarioAux.setRol("USER"); // Asigna rol por defecto
        }

        return usuarioAux;
    }

    /**
     * Convierte una entidad Usuario a un DTO.
     * La contraseña no se incluye en el DTO por seguridad.
     * @param usuario Entidad Usuario con datos.
     * @return Objeto DTO de Usuario sin la contraseña.
     */
    public UsuarioDto fromEntityToDto(Usuario usuario) {
        // Si la entidad es nula, retorna nulo
        if (usuario == null) {
            return null;
        }

        // Crea y retorna el DTO
        return new UsuarioDto(
                usuario.getIdUsuario(),
                usuario.getUsername(),
                null, // La contraseña nunca se expone en el DTO
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getEmail(),
                usuario.getRol()
        );
    }
}