package project.falloutNVbuilder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.falloutNVbuilder.Models.BuildModel;

@Repository
public interface BuildRepository extends JpaRepository<BuildModel, Long> {
}
