package project.falloutNVbuilder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.falloutNVbuilder.Models.RequisitoPerkModel;

@Repository
public interface RequisitoPerkRepository extends JpaRepository<RequisitoPerkModel, Long> {
}
