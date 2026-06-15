package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ConfiguracionDto {

    private Integer idConfiguracion;

    @NotNull
    private Boolean guardarResultados;

    @NotNull
    private Boolean formularioHabilitado;

}
