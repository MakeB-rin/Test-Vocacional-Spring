package Orientacion.Vocacional.IDRRU.Back.configuration; // Asegúrate que el paquete sea correcto

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuración global de CORS para permitir solicitudes
 * desde el frontend de Angular en desarrollo.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Aplica a todas las rutas del backend
                .allowedOrigins("http://localhost:4200") // Permite solicitudes SÓLO desde esta URL
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD") // Métodos HTTP permitidos
                .allowedHeaders("*") // Permite cualquier cabecera en la solicitud (Authorization, Content-Type, etc.)
                .allowCredentials(false); // Poner a true SOLO si usas cookies/sesiones y necesitas credenciales
    }
}