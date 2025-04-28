package Orientacion.Vocacional.IDRRU.Back.presentation.dto;

import Orientacion.Vocacional.IDRRU.Back.domain.entity.Base;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;




@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EstudianteDto extends Base {


    private Integer idEstudiante;

    private String ciEstudiante;

    @NotBlank(message = "El nombre NO debe ser blanco")
    @Size(min = 1, max = 200, message = "el nombre debe tener entre 2-198 caracteres")
    private String nombre;

    @NotBlank(message = "El apellido paterno NO debe ser blanco")
    @Size(min = 1, max = 200, message = "el apellido paterno debe tener entre 2-198 caracteres")
    private String apPaterno;

    @NotBlank(message = "El apellido materno NO debe ser blanco")
    @Size(min = 1, max = 200, message = "el apellido materno debe tener entre 2-198 caracteres")
    private String apMaterno;

    @NotBlank(message = "El colegio NO debe ser blanco")
    @Size(min = 1, max = 200, message = "el colegio debe tener entre 2-198 caracteres")
    private String colegio;

    @NotBlank(message = "El curso NO debe ser blanco")
    @Size(min = 1, max = 200, message = "el curso debe tener entre 2-198 caracteres")
    private String curso;

    @NotNull(message = "La edad NO debe ser blanco")
    private Integer edad;

    @NotBlank(message = "El celular NO debe ser blanco")
    @Size(min = 1, max = 200, message = "el celular debe tener entre 2-198 caracteres")
    private String celular;

    @NotNull(message = "Debe incluir el id municipio")
    private Integer id_municipio;


}
