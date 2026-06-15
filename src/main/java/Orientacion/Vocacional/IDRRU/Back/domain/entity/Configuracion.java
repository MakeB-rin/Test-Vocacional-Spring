package Orientacion.Vocacional.IDRRU.Back.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Configuracion extends Base{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_configuracion")
    private Integer idConfiguracion;

    @Column(name = "guardar_resultados", nullable = false)
    private Boolean guardarResultados;

    @Column(name = "formulario_habilitado", nullable = false)
    private Boolean formularioHabilitado;

}
