package project.falloutNVbuilder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.falloutNVbuilder.Models.TraitModel;

@Repository
public interface TraitRepository extends JpaRepository<TraitModel, Long> {
}
