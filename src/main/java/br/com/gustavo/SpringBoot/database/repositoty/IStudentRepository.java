package br.com.gustavo.SpringBoot.database.repositoty;

import br.com.gustavo.SpringBoot.database.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<StudentEntity, Integer> {
}
