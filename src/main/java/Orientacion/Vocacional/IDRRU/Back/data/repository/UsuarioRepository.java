package Orientacion.Vocacional.IDRRU.Back.data.repository;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Usuario;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repositorio para la entidad Usuario.
 * Permite operaciones con la base de datos para usuarios.
 */
@Repository
public interface UsuarioRepository extends GenericRepository<Usuario, Integer> {
    Optional<Usuario> findByUsername(String username);
    boolean existsByUsername(String username);
}