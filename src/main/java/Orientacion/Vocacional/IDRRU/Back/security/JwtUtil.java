package Orientacion.Vocacional.IDRRU.Back.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Utilidad para manejo de tokens JWT.
 * Proporciona metodos para generar, validar y extraer informacion de tokens.
 */
@Service
public class JwtUtil {

    private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private final long jwtExpiration = 24 * 60 * 60 * 1000; // 24 horas

    /**
     * Extrae el nombre de usuario desde un token JWT.
     *
     * @param token El token JWT.
     * @return El nombre de usuario extraido del token.
     */
    public String extraerNombreUsuario(String token) {
        return extraerClaim(token, Claims::getSubject);
    }

    /**
     * Extrae la fecha de expiracion desde un token JWT.
     *
     * @param token El token JWT.
     * @return La fecha de expiracion del token.
     */
    public Date extraerExpiracion(String token) {
        return extraerClaim(token, Claims::getExpiration);
    }

    /**
     * Extrae un claim especifico del token JWT.
     *
     * @param token El token JWT.
     * @param claimsResolver Funcion para obtener el campo deseado.
     * @param <T> El tipo de dato del campo.
     * @return El campo extraido del token.
     */
    public <T> T extraerClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extraerTodosClaims(token);
        return claimsResolver.apply(claims);
    }

    /**
     * Extrae todos los claims de un token JWT.
     *
     * @param token El token JWT.
     * @return Los claims del token.
     */
    private Claims extraerTodosClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    /**
     * Verifica si un token ha expirado.
     *
     * @param token El token JWT.
     * @return true si ha expirado, false en caso contrario.
     */
    private Boolean esTokenExpirado(String token) {
        return extraerExpiracion(token).before(new Date());
    }

    /**
     * Genera un token JWT para un usuario.
     *
     * @param userDetails Los detalles del usuario.
     * @return Un token JWT.
     */
    public String generarToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        return crearToken(claims, userDetails.getUsername());
    }

    /**
     * Crea un token JWT.
     *
     * @param claims Claims adicionales.
     * @param subject El sujeto del token (username).
     * @return El token JWT.
     */
    private String crearToken(Map<String, Object> claims, String subject) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + jwtExpiration))
                .signWith(key)
                .compact();
    }

    /**
     * Valida un token JWT.
     *
     * @param token El token JWT.
     * @param userDetails Los detalles del usuario.
     * @return true si el token es valido, false en caso contrario.
     */
    public Boolean validarToken(String token, UserDetails userDetails) {
        final String username = extraerNombreUsuario(token);
        return (username.equals(userDetails.getUsername()) && !esTokenExpirado(token));
    }
}