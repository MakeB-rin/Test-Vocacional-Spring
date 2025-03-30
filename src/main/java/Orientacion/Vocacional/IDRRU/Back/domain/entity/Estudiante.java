package Orientacion.Vocacional.IDRRU.Back.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private Integer idEstudiante;

    private String ciEstudiante;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String colegio;
    private String curso;
    private String edad;
    private String celular;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_municipio", nullable = false)
    private Municipio municipio;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estudiante")
    private List<Resultado> resultados;

}
