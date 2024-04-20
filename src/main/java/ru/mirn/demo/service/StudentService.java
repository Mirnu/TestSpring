package ru.mirn.demo.service;

import ru.mirn.demo.model.Student;
import java.util.List;

public interface StudentService {
    public List<Student> findAllStudent();
    public Student saveStudent(Student student);
    public Student findByEmail(String email);
    public Student updateStudent(Student student);
    public void deleteStudent(String email);
}
