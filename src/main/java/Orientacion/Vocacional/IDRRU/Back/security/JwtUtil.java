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
 * Utilidad para manejar tokens JWT (JSON Web Token).
 * Provee metodos para generar, validar y extraer informacion de tokens.
 */
@Service
public class JwtUtil {

    // Clave secreta para firmar el token
    private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    // Tiempo de expiracion del token: 24 horas en milisegundos
    private final long jwtExpiration = 24 * 60 * 60 * 1000;

    /**
     * Extrae el nombre de usuario (subject) desde un token JWT.
     *
     * @param token El token JWT del que se extraera el usuario.
     * @return El nombre de usuario extraido del token.
     */
    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    /**
     * Extrae la fecha de expiracion desde un token JWT.
     *
     * @param token El token JWT del que se extraera la fecha de expiracion.
     * @return La fecha de expiracion del token.
     */
    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    /**
     * Extrae un campo especifico (claim) desde el token JWT usando una funcion.
     *
     * @param token El token JWT.
     * @param claimsResolver Funcion para obtener el campo deseado de los claims.
     * @param <T> El tipo de dato del campo a extraer.
     * @return El campo extraido del token.
     */
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    /**
     * Extrae todos los claims (cuerpo con datos) de un token JWT.
     *
     * @param token El token JWT del que se extraerán todos los claims.
     * @return Un objeto Claims con todos los datos del token.
     */
    private Claims extractAllClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    /**
     * Verifica si un token JWT ya ha expirado.
     *
     * @param token El token JWT a verificar.
     * @return true si el token ha expirado, false en caso contrario.
     */
    private Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    /**
     * Genera un token JWT para un usuario autenticado.
     *
     * @param userDetails Los detalles del usuario para quien se genera el token.
     * @return Un nuevo token JWT generado.
     */
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, userDetails.getUsername());
    }

    /**
     * Crea un token JWT con los claims y el sujeto (usuario) especificados.
     * Establece la fecha de emision y expiracion del token.
     *
     * @param claims Mapa de claims adicionales a incluir en el token.
     * @param subject El sujeto (normalmente el nombre de usuario) del token.
     * @return El token JWT firmado y compactado.
     */
    private String createToken(Map<String, Object> claims, String subject) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + jwtExpiration))
                .signWith(key)
                .compact();
    }

    /**
     * Valida si un token JWT es valido para un usuario y no esta expirado.
     *
     * @param token El token JWT a validar.
     * @param userDetails Los detalles del usuario con el que se compara el token.
     * @return true si el token es valido y no ha expirado, false en caso contrario.
     */
    public Boolean validateToken(String token, UserDetails userDetails) {
        final String username = extractUsername(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }
}