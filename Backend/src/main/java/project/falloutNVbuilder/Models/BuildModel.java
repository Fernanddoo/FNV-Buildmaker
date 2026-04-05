package project.falloutNVbuilder.Models;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "build")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuildModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_build", nullable = false, length = 100)
    private String nomeBuild;

    @Column(nullable = false, length = 20)
    private String genero;

    @Column(columnDefinition = "int default 1")
    private Integer nivel;

    @Column(columnDefinition = "int default 5")
    private Integer forca;

    @Column(columnDefinition = "int default 5")
    private Integer percepcao;

    @Column(columnDefinition = "int default 5")
    private Integer resistencia;

    @Column(columnDefinition = "int default 5")
    private Integer carisma;

    @Column(columnDefinition = "int default 5")
    private Integer inteligencia;

    @Column(columnDefinition = "int default 5")
    private Integer agilidade;

    @Column(columnDefinition = "int default 5")
    private Integer sorte;

    @ManyToMany
    @JoinTable(name = "build_trait",
            joinColumns = @JoinColumn(name = "build_id"),
            inverseJoinColumns = @JoinColumn(name = "trait_id")
    )
    private List<TraitModel> traits;

    @ManyToMany
    @JoinTable(
            name = "build_perk",
            joinColumns = @JoinColumn(name = "build_id"),
            inverseJoinColumns = @JoinColumn(name = "perk_id")
    )
    private List<PerkModel> perks;

    @OneToMany(mappedBy = "build", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BuildSkillModel> skillsDistribuidas;


}
