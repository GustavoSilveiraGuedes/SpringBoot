package br.com.gustavo.SpringBoot.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ExerciseDto {

    @NotBlank
    private String name;

    @NotBlank
    private String muscleGroup;

}
