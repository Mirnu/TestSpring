package ru.mirn.demo.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirn.demo.model.Student;
import ru.mirn.demo.repository.InMemoryStudentDAO;
import ru.mirn.demo.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentService implements StudentService {
    private final InMemoryStudentDAO repository;

    public List<Student> findAllStudent() {
        return repository.getStudents();
    }

    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}