package Orientacion.Vocacional.IDRRU.Back.configuration;

import Orientacion.Vocacional.IDRRU.Back.security.JwtAuthFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

// Importa withDefaults para la configuracion CORS
import static org.springframework.security.config.Customizer.withDefaults;

/**
 * Configuracion principal de seguridad para la aplicacion.
 * Usa JWT para proteger los endpoints.
 */
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final JwtAuthFilter jwtAuthFilter;
    private final UserDetailsService userDetailsService;

    /**
     * Configura la cadena de filtros de seguridad HTTP.
     * Define reglas de acceso (autorizacion) e integra filtros.
     *
     * @param http Configuracion de seguridad HTTP.
     * @return Cadena de filtros configurada.
     * @throws Exception Si falla la configuracion.
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http

                .cors(withDefaults()) // Habilita CORS con configuracion por defecto
                // Deshabilita CSRF, es seguro en APIs REST sin sesiones con cookies.
                .csrf(csrf -> csrf.disable())

                // Configura reglas de autorizacion por ruta.
                .authorizeHttpRequests(auth -> auth
                        // Permite acceso sin autenticacion a estas rutas.
                        .requestMatchers("/facultad/**").permitAll()
                        .requestMatchers("/auth/register").permitAll()
                        .requestMatchers("/auth/login").permitAll()

                        // Requiere rol ADMIN para acceder a esta ruta.
                        .requestMatchers("/provincia/**").hasRole("ADMIN")

                        // Cualquier otra ruta requiere autenticacion.
                        .anyRequest().authenticated()
                )

                // Configura gestion de sesiones como STATELESS (sin estado).
                .sessionManagement(session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                // Establece el proveedor de autenticacion personalizado.
                .authenticationProvider(authenticationProvider())
                // Agrega el filtro JWT antes del filtro de autenticacion de usuario/clave.
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    /**
     * Configura el proveedor de autenticacion DAO.
     * Usa UserDetailsService y PasswordEncoder.
     *
     * @return Proveedor de autenticacion configurado.
     */
    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder()); // Usa el PasswordEncoder definido
        return authProvider;
    }

    /**
     * Proporciona el gestor de autenticacion.
     * Spring Security lo usa para autenticar.
     *
     * @param config Configuracion de autenticacion de Spring.
     * @return Gestor de autenticacion.
     * @throws Exception Si hay un error.
     */
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

    /**
     * Define el codificador de contraseñas (BCrypt).
     * Es seguro para hashear contraseñas.
     *
     * @return Codificador de contraseñas.
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}