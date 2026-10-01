package br.com.gustavo.SpringBoot.database.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToOne
    @JoinColumn(name = "physical_assessment_id")
    private PhysicalAssessmentEntity physicalAssessmentId;

    @OneToMany(mappedBy = "studentId")
    private Set<WorkoutEntity> workouts = new HashSet<>();
}
