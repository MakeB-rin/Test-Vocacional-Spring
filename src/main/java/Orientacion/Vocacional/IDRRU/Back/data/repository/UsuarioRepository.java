package Orientacion.Vocacional.IDRRU.Back.data.repository;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repositorio para la entidad Usuario.
 * Extiende GenericRepository para operaciones básicas de CRUD.
 */
@Repository
public interface UsuarioRepository extends GenericRepository<Usuario, Integer> {

    /**
     * Busca un usuario por su nombre de usuario.
     * @param username Nombre de usuario.
     * @return Optional con el usuario si existe.
     */
    Optional<Usuario> findByUsername(String username);

    /**
     * Verifica si existe un usuario con el nombre de usuario dado.
     * @param username Nombre de usuario.
     * @return true si existe, false si no.
     */
    boolean existsByUsername(String username);
}
