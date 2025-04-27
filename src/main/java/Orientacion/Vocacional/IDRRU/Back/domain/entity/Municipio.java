package Orientacion.Vocacional.IDRRU.Back.domain.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Municipio extends Base{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_municipio")
    private Integer idMunicipio;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_provincia", referencedColumnName = "id_provincia", nullable = false)
    private Provincia provincia;

    @OneToMany(mappedBy = "municipio", cascade = CascadeType.ALL)
    private List<Estudiante> estudiantes;
}