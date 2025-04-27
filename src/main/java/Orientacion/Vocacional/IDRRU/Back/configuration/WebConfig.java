package Orientacion.Vocacional.IDRRU.Back.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuracion CORS para permitir peticiones desde el frontend.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * Configura las reglas de CORS.
     * @param registry Objeto para registrar configuraciones CORS.
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD")
                .allowedHeaders("*")
                .allowCredentials(false);
    }
}