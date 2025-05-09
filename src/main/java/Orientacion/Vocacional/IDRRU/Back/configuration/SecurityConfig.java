package Orientacion.Vocacional.IDRRU.Back.configuration;

import Orientacion.Vocacional.IDRRU.Back.security.JwtAuthFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.EnableScheduling;
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

import static org.springframework.security.config.Customizer.withDefaults;

/**
 * Configuracion de seguridad para la aplicacion.
 * Establece politicas de autenticacion, autorizacion y filtros de seguridad.
 */
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@EnableScheduling
public class SecurityConfig {

    private final JwtAuthFilter jwtAuthFilter;
    private final UserDetailsService userDetailsService;

    /**
     * Configura la cadena de filtros de seguridad HTTP.
     * Define reglas de acceso y filtros de autenticacion.
     *
     * @param http Configuracion de seguridad HTTP.
     * @return Cadena de filtros configurada.
     * @throws Exception Si falla la configuracion.
     */
    @Bean
    public SecurityFilterChain configurarCadenaFiltrosSeguridad(HttpSecurity http) throws Exception {
        http
                .cors(withDefaults())
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        // Rutas publicas

                        .requestMatchers("/auth/login").permitAll()
                        //.requestMatchers("/estudiante/**").permitAll()
                        .requestMatchers(HttpMethod.POST, "/estudiante/**").permitAll()
                        .requestMatchers(HttpMethod.PUT, "/estudiante/**").permitAll()
                        // Las demas rutas requieren autenticacion
                        .anyRequest().authenticated()
                )
                .sessionManagement(session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                .authenticationProvider(proveedorAutenticacion())
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    /**
     * Configura el proveedor de autenticacion DAO.
     *
     * @return Proveedor de autenticacion configurado.
     */
    @Bean
    public AuthenticationProvider proveedorAutenticacion() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(codificadorContrasenas());
        return authProvider;
    }

    /**
     * Proporciona el gestor de autenticacion.
     *
     * @param config Configuracion de autenticacion de Spring.
     * @return Gestor de autenticacion.
     * @throws Exception Si hay un error.
     */
    @Bean
    public AuthenticationManager gestorAutenticacion(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

    /**
     * Define el codificador de contrasenas (BCrypt).
     *
     * @return Codificador de contrasenas.
     */
    @Bean
    public PasswordEncoder codificadorContrasenas() {
        return new BCryptPasswordEncoder();
    }
}