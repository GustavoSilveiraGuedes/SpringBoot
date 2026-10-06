package br.com.gustavo.SpringBoot.database.repositoty;

import br.com.gustavo.SpringBoot.database.model.ExerciseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExerciseRepository extends JpaRepository<ExerciseEntity, Integer> {
}
