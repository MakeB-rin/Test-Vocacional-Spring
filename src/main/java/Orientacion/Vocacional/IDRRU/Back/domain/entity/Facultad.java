package Orientacion.Vocacional.IDRRU.Back.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

// Entidad Facultad: Representa una facultad en la base de datos
@Data // Incluye @Getter, @Setter, @ToString, @EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
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

    // Relación con la entidad Resultado
    // @OneToMany(mappedBy = "facultad", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // private List<Resultado> resultados;
}
