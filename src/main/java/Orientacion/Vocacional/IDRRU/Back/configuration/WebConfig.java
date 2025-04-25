package Orientacion.Vocacional.IDRRU.Back.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuracion para habilitar CORS (Cross-Origin Resource Sharing).
 * Permite al frontend acceder al backend desde otro dominio/puerto.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * Configura las reglas de CORS.
     * @param registry Objeto para registrar configuraciones CORS.
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Aplica a todas las rutas
                .allowedOrigins("http://localhost:4200") // Permite solicitudes solo desde este origen
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD") // Metodos HTTP permitidos
                .allowedHeaders("*") // Permite todos los encabezados
                .allowCredentials(false); // No permite envio de credenciales (ej: cookies)
    }
}