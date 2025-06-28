package Orientacion.Vocacional.IDRRU.Back.security;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Servicio para la lista negra de tokens JWT.
 * Almacena tokens que han sido invalidados por cierre de sesión, con manejo de expiracion.
 */
@Service
public class TokenBlacklistService {

    /**
     * Mapa de tokens invalidados.
     * La clave es el token, el valor es el timestamp de expiracion (en milisegundos).
     */
    private final Map<String, Long> blacklistedTokens = new ConcurrentHashMap<>();

    /**
     * Agrega un token a la lista negra con su tiempo de expiracion.
     * Esto lo marca como inválido para futuros usos hasta que expire.
     *
     * @param token El token JWT a invalidar.
     * @param expirationTimeMillis El timestamp (en milisegundos desde la época) cuando el token expira.
     * Este valor usualmente se obtiene del propio token JWT.
     */
    public void blacklistToken(String token, Long expirationTimeMillis) {
        if (expirationTimeMillis > System.currentTimeMillis()) {
            blacklistedTokens.put(token, expirationTimeMillis);
        }
    }

    /**
     * Verifica si un token se encuentra en la lista negra Y si aún no ha expirado.
     * Un token se considera blacklisted (y debe ser rechazado) solo si está en la lista
     * y su tiempo de expiración en la lista negra aún no ha pasado.
     *
     * @param token El token JWT a verificar.
     * @return true si el token está en la lista negra y aún es válido (debe ser rechazado), false en caso contrario.
     */
    public boolean isBlacklisted(String token) {
        Long expirationTime = blacklistedTokens.get(token);
        return expirationTime != null && expirationTime > System.currentTimeMillis();
    }

    /**
     * Tarea programada para limpiar tokens expirados de la lista negra.
     * Ejecuta esta limpieza periódicamente para liberar memoria.
     * Elimina tokens cuyo tiempo de expiracion sea igual o anterior al tiempo actual.
     */
    @Scheduled(fixedRate = 6000000)
    public void cleanupBlacklist() {
        long currentTime = System.currentTimeMillis();
        blacklistedTokens.entrySet().removeIf(entry -> entry.getValue() <= currentTime);
    }

    public int getSize() {
        return blacklistedTokens.size();
    }
}