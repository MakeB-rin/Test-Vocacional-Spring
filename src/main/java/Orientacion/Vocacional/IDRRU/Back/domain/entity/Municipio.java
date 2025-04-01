package Orientacion.Vocacional.IDRRU.Back.domain.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@ToString
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
    @JoinColumn(name = "id_provincia",referencedColumnName = "id_provincia", nullable = false)
    private Provincia provincia;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "municipio")
//    private List<Estudiante> estudiantes;
}