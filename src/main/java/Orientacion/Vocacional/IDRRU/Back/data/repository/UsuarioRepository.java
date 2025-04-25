package Orientacion.Vocacional.IDRRU.Back.data.repository;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repositorio para la entidad Usuario.
 * Permite operaciones con la base de datos para la tabla Usuario.
 */
@Repository
public interface UsuarioRepository extends GenericRepository<Usuario, Integer> {

    /**
     * Busca un usuario por su nombre de usuario.
     * @param username Nombre de usuario a buscar.
     * @return Un Optional con el usuario encontrado, o vacio si no existe.
     */
    Optional<Usuario> findByUsername(String username);

    /**
     * Verifica si un nombre de usuario ya existe en la base de datos.
     * @param username Nombre de usuario a verificar.
     * @return 'true' si el nombre de usuario ya existe, 'false' en caso contrario.
     */
    boolean existsByUsername(String username);
}