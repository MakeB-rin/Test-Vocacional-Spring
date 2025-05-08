package Orientacion.Vocacional.IDRRU.Back.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Holland extends Base{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_holland")
    private Integer idHolland;

    private Integer personalidad;

    @OneToMany(mappedBy = "holland", cascade = CascadeType.ALL)
    private List<Resultado> resultados;

}