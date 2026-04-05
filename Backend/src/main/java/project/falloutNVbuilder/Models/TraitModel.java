package project.falloutNVbuilder.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "trait")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TraitModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(columnDefinition = "TEXT")
    private String descricao;


}
