package project.falloutNVbuilder.Models;

import jakarta.persistence.*;
import lombok.*;
import project.falloutNVbuilder.Enum.TipoRequisito;

@Entity
@Table(name = "requisitos_perk")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequisitoPerkModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "perk_id", nullable = false)
    private PerkModel perk;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_requisito", nullable = false, length = 20)
    private TipoRequisito tipoRequisito;

    @Column(name = "nome_alvo", nullable = false, length = 50)
    private String nomeAlvo;

    @Column(name = "valor_minimo")
    private Integer valorMinimo;


}
