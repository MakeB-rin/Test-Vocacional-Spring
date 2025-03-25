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
public class Chaside {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chaside")
    private Integer idChaside;

    private String codigo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "chaside")
    private List<Resultado> resultados;

}
