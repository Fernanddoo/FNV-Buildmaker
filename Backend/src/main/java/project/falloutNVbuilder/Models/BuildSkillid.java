package project.falloutNVbuilder.Models;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuildSkillid implements Serializable{

    @Column(name = "build_id")
    private Long buildId;

    @Column(name = "skill_id")
    private Long skillId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildSkillid that = (BuildSkillid) o;
        return Objects.equals(buildId, that.buildId) && Objects.equals(skillId, that.skillId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildId, skillId);
    }


}
