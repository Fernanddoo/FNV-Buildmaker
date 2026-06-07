package project.falloutNVbuilder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.falloutNVbuilder.Models.PerkModel;

@Repository
public interface PerkRepository extends JpaRepository<PerkModel, Long> {
}
