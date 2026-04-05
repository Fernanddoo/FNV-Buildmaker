package project.falloutNVbuilder.Models;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "build_skill")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuildSkillModel {

    @EmbeddedId
    private BuildSkillid id = new BuildSkillid();

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("buildId")
    @JoinColumn(name = "build_id")
    private BuildModel build;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("skillId")
    @JoinColumn(name = "skill_id")
    private SkillModel skill;

    @Column(columnDefinition = "int default 15")
    private Integer pontuacao;



}
