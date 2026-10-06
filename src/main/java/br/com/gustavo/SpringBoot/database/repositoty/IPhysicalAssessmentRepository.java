package br.com.gustavo.SpringBoot.database.repositoty;

import br.com.gustavo.SpringBoot.database.model.PhysicalAssessmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhysicalAssessmentRepository extends JpaRepository<PhysicalAssessmentEntity, Integer> {
}
