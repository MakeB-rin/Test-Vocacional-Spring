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

// Importa withDefaults para la configuración CORS
import static org.springframework.security.config.Customizer.withDefaults;

/**
 * Configuración de seguridad para la aplicación.
 * Define las rutas protegidas, los filtros de autenticación y el proveedor de autenticación.
 */
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final JwtAuthFilter jwtAuthFilter;
    private final UserDetailsService userDetailsService;

    /**
     * Define la cadena de filtros de seguridad y las políticas de autorización.
     * @param http Objeto HttpSecurity proporcionado por Spring Security.
     * @return Cadena de filtros de seguridad configurada.
     * @throws Exception En caso de error durante la configuración.
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // *** INICIO: MODIFICACIÓN NECESARIA ***
                // Habilita CORS usando la configuración predeterminada (buscará un Bean WebMvcConfigurer o CorsConfigurationSource)
                .cors(withDefaults())
                // *** FIN: MODIFICACIÓN NECESARIA ***

                .csrf(csrf -> csrf.disable()) // Desactiva protección CSRF (ya que se usa JWT)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/facultad/**").permitAll() // Público
                        .requestMatchers("/auth/register").permitAll() // Público
                        .requestMatchers("/auth/login").permitAll() // Público

                        // Ejemplo: Requiere rol ADMIN para /provincia (verifica si este rol existe en tu sistema)
                        .requestMatchers("/provincia/**").hasRole("ADMIN")

                        // Cualquier otra solicitud requiere autenticación
                        .anyRequest().authenticated()
                )
                .sessionManagement(session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS) // No se mantiene sesión (JWT)
                )
                .authenticationProvider(authenticationProvider()) // Proveedor de autenticación personalizado
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class); // Agrega el filtro JWT

        return http.build();
    }

    /**
     * Configura el proveedor de autenticación usando un UserDetailsService y un codificador de contraseñas.
     * @return Proveedor de autenticación.
     */
    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    /**
     * Proporciona el AuthenticationManager que se utiliza para autenticar usuarios.
     * @param config Configuración de autenticación.
     * @return AuthenticationManager.
     * @throws Exception En caso de error.
     */
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

    /**
     * Codificador de contraseñas que utiliza el algoritmo BCrypt.
     * @return PasswordEncoder.
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}