package Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces;

import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TokenBlacklistService {

    // Conjunto de tokens invalidos
    private Set<String> blacklistedTokens = ConcurrentHashMap.newKeySet();

    /**
     * Agrega un token a la lista negra (invalida).
     */
    public void blacklistToken(String token) {
        blacklistedTokens.add(token);
    }

    /**
     * Verifica si el token ha sido invalidado.
     */
    public boolean isBlacklisted(String token) {
        return blacklistedTokens.contains(token);
    }
}
