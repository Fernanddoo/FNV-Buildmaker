package project.falloutNVbuilder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.falloutNVbuilder.Models.SkillModel;

@Repository
public interface SkillRepository extends JpaRepository<SkillModel, Long> {
}
