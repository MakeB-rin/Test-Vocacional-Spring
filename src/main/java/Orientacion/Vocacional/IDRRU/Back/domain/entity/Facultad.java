package Orientacion.Vocacional.IDRRU.Back.domain.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Facultad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_facultad")
    private Integer idFacultad;
    private String codigo;
    private String nombre;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "facultad")
    private List<Resultado> resultados;
}
