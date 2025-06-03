package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

// DTO para Facultad con validaciones
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class FacultadDto {
    private Integer idFacultad;
    private String codigo;
    private String nombre;
    private String url;
    private String imgLogo;
    private String carreras;
    private Integer idChaside;
}