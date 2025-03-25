package Orientacion.Vocacional.IDRRU.Back.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

@Entity
public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_municipio")
    private Integer idMunicipio;

    private String nombre;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "municipio")
    private List<Provincia> provincias;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "municipio")
    private List<Estudiante> estudiantes;
}
