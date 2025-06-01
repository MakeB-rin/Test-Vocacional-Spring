package Orientacion.Vocacional.IDRRU.Back.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

// Entidad Facultad: Representa una facultad en la base de datos
// Incluye @Getter, @Setter, @ToString, @EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Facultad extends Base{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_facultad")
    private Integer idFacultad;

    @Column(nullable = false, length = 50)
    private String codigo;

    @Column(nullable = false, length = 200)
    private String nombre;

    @Column(length = 500)
    private String url;

    @Column(name = "img_logo", length = 500)
    private String imgLogo;

    @Column(columnDefinition = "TEXT")
    private String carreras;

    @ManyToOne
    @JoinColumn(name = "id_chaside", referencedColumnName = "id_chaside", nullable = false)
    private Chaside chaside;

}
