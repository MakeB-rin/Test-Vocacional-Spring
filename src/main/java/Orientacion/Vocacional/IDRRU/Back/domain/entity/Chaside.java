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
public class Chaside extends Base{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chaside")
    private Integer idChaside;

    private String codigo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "chaside")
    @JsonIgnore
    private List<Resultado> resultados;

}
