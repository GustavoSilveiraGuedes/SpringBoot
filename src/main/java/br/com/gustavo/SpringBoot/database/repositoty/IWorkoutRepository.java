package br.com.gustavo.SpringBoot.database.repositoty;

import br.com.gustavo.SpringBoot.database.model.WorkoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWorkoutRepository extends JpaRepository<WorkoutEntity, Integer> {
}
