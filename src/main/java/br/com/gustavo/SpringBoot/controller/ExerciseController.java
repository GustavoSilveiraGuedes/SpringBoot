package br.com.gustavo.SpringBoot.controller;

import br.com.gustavo.SpringBoot.database.model.ExerciseEntity;
import br.com.gustavo.SpringBoot.dto.ExerciseDto;
import br.com.gustavo.SpringBoot.service.ExerciseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/exercises")
@RequiredArgsConstructor
@Validated
public class ExerciseController {

    private final ExerciseService exerciseService;

    @GetMapping
    public ResponseEntity<List<ExerciseEntity>> findAll(){
        return new ResponseEntity<>(exerciseService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> save(@Valid @RequestBody ExerciseDto exerciseDto){
        exerciseService.save(exerciseDto);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

}
