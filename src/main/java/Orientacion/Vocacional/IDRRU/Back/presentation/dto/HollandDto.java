package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class HollandDto {
    private Integer idHolland;
    private String codigo;
    private String nombre;
    private String descripcion;
}