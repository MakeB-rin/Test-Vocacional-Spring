package Orientacion.Vocacional.IDRRU.Back.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "estudiante")
public class Estudiante extends Base{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private Integer idEstudiante;

    @Column(name = "ci_estudiante")
    private String ciEstudiante;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ap_paterno")
    private String apPaterno;

    @Column(name = "ap_materno")
    private String apMaterno;

    @Column(name = "colegio")
    private String colegio;

    @Column(name = "curso")
    private String curso;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "celular")
    private String celular;

    @ManyToOne
    @JoinColumn(name = "id_municipio", referencedColumnName = "id_municipio", nullable = false)
    private Municipio municipio;

    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL)
    private List<Resultado> resultados;

}