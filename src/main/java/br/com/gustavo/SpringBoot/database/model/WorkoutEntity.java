package br.com.gustavo.SpringBoot.database.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "workouts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class WorkoutEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "students_id")
    private StudentEntity studentId;

    @ManyToMany
    @JoinTable(
            name = "workouts_exercises",
            joinColumns = @JoinColumn(name = "workouts_id"),
            inverseJoinColumns = @JoinColumn(name = "exercises_id")
    )
    private Set<ExerciseEntity> exercises = new HashSet<>();

}
