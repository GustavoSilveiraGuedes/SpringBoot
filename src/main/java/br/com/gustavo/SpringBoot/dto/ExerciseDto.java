package br.com.gustavo.SpringBoot.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ExerciseDto {

    private String name;
    private String muscleGroup;

}
