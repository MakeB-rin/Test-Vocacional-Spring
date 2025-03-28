package Orientacion.Vocacional.IDRRU.Back.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Resultado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_resultado")
    private Integer idResultado;

    private Integer interes;
    private Integer aptitud;
    private String puntajeHolland;
    private String fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estudiante", nullable = false)
    private Estudiante estudiante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_chaside", nullable = false)
    private Chaside chaside;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_holland", nullable = false)
    private Holland holland;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_facultad", nullable = false)
    private Facultad facultad;
}
