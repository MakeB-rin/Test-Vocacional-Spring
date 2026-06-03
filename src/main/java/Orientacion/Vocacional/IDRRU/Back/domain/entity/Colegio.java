package Orientacion.Vocacional.IDRRU.Back.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Colegio  extends Base{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_colegio")
    private Integer idColegio;

    private String Nombre;

    @ManyToOne
    @JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio", nullable = false)
    private Municipio municipio;

    @OneToMany(mappedBy = "colegio", cascade = CascadeType.ALL)
    private List<Estudiante> estudiantes;

}
