package ru.mirn.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirn.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
     void deleteByEmail(String email);
     Student findStudentByEmail(String email);
}