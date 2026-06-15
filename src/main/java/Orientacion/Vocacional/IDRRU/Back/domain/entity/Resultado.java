package Orientacion.Vocacional.IDRRU.Back.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.UUID;

// Entidad Resultado: Representa un resultado en la base de datos
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Resultado extends Base{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_resultado")
    private Integer idResultado;

    @Column(name = "interes")
    private Integer interes;

    @Column(name = "aptitud")
    private Integer aptitud;

    @Column(name = "puntaje_chaside")
    private String puntajeChaside;

    @Column(name = "puntaje_holland")
    private String puntajeHolland;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "codigo_seguridad", unique = true, nullable = false, length = 20)
    private String codigoSeguridad;

    // Este anotacion hace que se ejecuta antes de que un objeto sea guardado en la bd
    @PrePersist
    public void prePersist(){
        if(fecha == null){
            this.fecha = Year.now().toString(); // cadena
        }

        if(codigoSeguridad == null){
            this.codigoSeguridad = UUID.randomUUID()
                    .toString()
                    .replace("-", "")
                    .substring(0,12)
                    .toUpperCase();
        }
    }

    @ManyToOne
    @JoinColumn(name = "id_estudiante", referencedColumnName = "id_estudiante", nullable = false)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "id_chaside", referencedColumnName = "id_chaside", nullable = false)
    private Chaside chaside;

    @ManyToOne
    @JoinColumn(name = "id_holland", referencedColumnName = "id_holland", nullable = false)
    private Holland holland;

//    @ManyToOne
//    @JoinColumn(name = "id_facultad", referencedColumnName = "id_facultad", nullable = false)
//    private Facultad facultad;

}
