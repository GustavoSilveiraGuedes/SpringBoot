package br.com.gustavo.SpringBoot.database.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "exercises")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ExerciseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "muscle_group",nullable = false)
    private String muscleGroup;

}
