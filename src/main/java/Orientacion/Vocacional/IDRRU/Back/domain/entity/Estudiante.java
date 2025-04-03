package Orientacion.Vocacional.IDRRU.Back.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class Estudiante extends Base{

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
    private Integer edad;
    private String celular;

    @ManyToOne
    @JoinColumn(name = "id_provincia",referencedColumnName = "id_provincia", nullable = false)
    private Provincia provincia;

    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Resultado> resultados;

}
