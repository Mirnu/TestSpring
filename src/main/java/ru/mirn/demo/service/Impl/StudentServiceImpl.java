package ru.mirn.demo.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.mirn.demo.model.Student;
import ru.mirn.demo.repository.StudentRepository;
import ru.mirn.demo.service.StudentService;

import java.util.List;

@Primary
@Repository
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;

    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public Student findByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Transactional
    public void deleteStudent(String email) {
        repository.deleteByEmail(email);
    }
}
