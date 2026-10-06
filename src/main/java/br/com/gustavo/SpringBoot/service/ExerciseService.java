package br.com.gustavo.SpringBoot.service;

import br.com.gustavo.SpringBoot.database.model.ExerciseEntity;
import br.com.gustavo.SpringBoot.database.repositoty.IExerciseRepository;
import br.com.gustavo.SpringBoot.dto.ExerciseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExerciseService {

    private final IExerciseRepository exerciseRepository;

    public List<ExerciseEntity> findAll(){
        return exerciseRepository.findAll();
    }

    public void save(ExerciseDto exerciseDto){

        exerciseRepository.save(ExerciseEntity.builder()
                .name(exerciseDto.getName())
                .muscleGroup(exerciseDto.getMuscleGroup())
                .build());

    }
}
