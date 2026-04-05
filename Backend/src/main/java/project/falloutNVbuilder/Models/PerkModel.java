package project.falloutNVbuilder.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "perk")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PerkModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Column(name = "level_minimo", nullable = false)
    private Integer levelMinimo;

    // mappedBy aponta para o nome da variável "perk" na classe RequisitoPerk
    @OneToMany(mappedBy = "perk", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RequisitoPerkModel> requisitos;


}
