package br.com.gustavo.SpringBoot.database.repositoty;

import br.com.gustavo.SpringBoot.database.model.ExerciseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IExerciseRepository extends JpaRepository<ExerciseEntity, Integer> {

     List<ExerciseEntity> findAllByMuscleGroup(String muscleGroup);

}
