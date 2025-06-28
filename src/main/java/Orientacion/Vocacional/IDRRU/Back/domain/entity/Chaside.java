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

    @Column(nullable = false, length = 10)
    private String codigo;

    @Column(nullable = false, length = 500)
    private String descripcion;

    @OneToMany(mappedBy = "chaside", cascade = CascadeType.ALL)
    private List<Resultado> resultados;

    @OneToMany(mappedBy = "chaside", cascade = CascadeType.ALL)
    private List<Facultad> facultades;
}