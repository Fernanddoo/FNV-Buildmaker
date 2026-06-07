package project.falloutNVbuilder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.falloutNVbuilder.Models.BuildSkillModel;
import project.falloutNVbuilder.Models.BuildSkillid;

@Repository
public interface BuildSkillRepository extends JpaRepository<BuildSkillModel, BuildSkillid> {
}
