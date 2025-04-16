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

@Component
@RequiredArgsConstructor
public class JwtAuthFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;
    private final UserDetailsService userDetailsService;
    private final TokenBlacklistService tokenBlacklistService;

    /**
     * Filtro que se ejecuta una vez por solicitud para verificar el token JWT.
     */
    @Override
    protected void doFilterInternal(
            @NonNull HttpServletRequest request,
            @NonNull HttpServletResponse response,
            @NonNull FilterChain filterChain
    ) throws ServletException, IOException {

        // Obtiene el encabezado de autorización
        final String authHeader = request.getHeader("Authorization");
        final String jwt;
        final String username;

        // Si no hay token o no comienza con "Bearer ", se continúa sin autenticación
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

        // Extraer el token JWT
        jwt = authHeader.substring(7);

        // Verifica si el token ha sido invalidado (logout)
        if (tokenBlacklistService.isBlacklisted(jwt)) {
            filterChain.doFilter(request, response);
            return;
        }

        // Extraer el nombre de usuario del token
        username = jwtUtil.extractUsername(jwt);

        // Si el usuario no está autenticado aún, validamos el token y autenticamos
        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);

            // Si el token es válido, se configura la autenticación en el contexto
            if (jwtUtil.validateToken(jwt, userDetails)) {
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                        userDetails,
                        null,
                        userDetails.getAuthorities()
                );
                authToken.setDetails(
                        new WebAuthenticationDetailsSource().buildDetails(request)
                );
                SecurityContextHolder.getContext().setAuthentication(authToken);
            }
        }

        // Continúa con el siguiente filtro de la cadena
        filterChain.doFilter(request, response);
    }
}
