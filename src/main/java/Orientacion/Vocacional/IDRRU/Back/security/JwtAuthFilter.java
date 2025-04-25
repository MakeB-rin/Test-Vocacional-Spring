package Orientacion.Vocacional.IDRRU.Back.security;

import Orientacion.Vocacional.IDRRU.Back.domain.service.interfaces.TokenBlacklistService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * Filtro de autenticacion JWT personalizado.
 * Intercepta las solicitudes para validar el token JWT presente en el encabezado Authorization.
 */
@Component
@RequiredArgsConstructor
public class JwtAuthFilter extends OncePerRequestFilter {

    /** Utilidad para operaciones con tokens JWT. */
    private final JwtUtil jwtUtil;
    /** Servicio para cargar detalles del usuario. */
    private final UserDetailsService userDetailsService;
    /** Servicio para verificar si un token esta en la lista negra. */
    private final TokenBlacklistService tokenBlacklistService;

    /**
     * Realiza el filtrado de la solicitud para validar el token JWT.
     * Este metodo se ejecuta una vez por cada solicitud HTTP.
     *
     * @param request La solicitud HTTP entrante.
     * @param response La respuesta HTTP saliente.
     * @param filterChain La cadena de filtros.
     * @throws ServletException Si ocurre un error especifico de servlet.
     * @throws IOException Si ocurre un error de entrada/salida.
     */
    @Override
    protected void doFilterInternal(
            @NonNull HttpServletRequest request,
            @NonNull HttpServletResponse response,
            @NonNull FilterChain filterChain
    ) throws ServletException, IOException {

        // Obtiene el encabezado de autorizacion
        final String authHeader = request.getHeader("Authorization");
        final String jwt;
        final String username;

        // Si no hay token o no comienza con "Bearer ", se continua sin autenticacion
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

        // Extraer el token JWT (remover "Bearer ")
        jwt = authHeader.substring(7);

        // Verifica si el token ha sido invalidado (logout)
        if (tokenBlacklistService.isBlacklisted(jwt)) {
            filterChain.doFilter(request, response);
            return;
        }

        // Extraer el nombre de usuario del token
        username = jwtUtil.extractUsername(jwt);

        // Si el usuario no esta autenticado aun, validamos el token y autenticamos
        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);

            // Si el token es valido, se configura la autenticacion en el contexto de seguridad
            if (jwtUtil.validateToken(jwt, userDetails)) {
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                        userDetails,
                        null, // La contrasena ya no es necesaria despues de la validacion del token
                        userDetails.getAuthorities()
                );
                authToken.setDetails(
                        new WebAuthenticationDetailsSource().buildDetails(request)
                );
                SecurityContextHolder.getContext().setAuthentication(authToken);
            }
        }

        // Continua con el siguiente filtro de la cadena
        filterChain.doFilter(request, response);
    }
}
