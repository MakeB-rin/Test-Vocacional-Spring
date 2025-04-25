package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Servicio para gestionar tokens JWT que han sido invalidados (lista negra).
 */
@Service
public class TokenBlacklistService {

    /**
     * Conjunto de tokens invalidos.
     */
    private Set<String> blacklistedTokens = ConcurrentHashMap.newKeySet();

    /**
     * Agrega un token a la lista negra.
     * Esto lo marca como invalido para futuros usos.
     *
     * @param token El token JWT a invalidar.
     */
    public void blacklistToken(String token) {
        blacklistedTokens.add(token);
    }

    /**
     * Verifica si un token se encuentra en la lista negra.
     *
     * @param token El token JWT a verificar.
     * @return true si el token esta en la lista negra, false en caso contrario.
     */
    public boolean isBlacklisted(String token) {
        return blacklistedTokens.contains(token);
    }
}