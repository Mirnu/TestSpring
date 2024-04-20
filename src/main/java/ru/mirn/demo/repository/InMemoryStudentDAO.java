package ru.mirn.demo.repository;

import org.springframework.stereotype.Repository;
import ru.mirn.demo.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDAO {
    private final List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student findByEmail(String email) {
        return students.stream()
                .filter(element -> element.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public Student updateStudent(Student student) {
        int studentIndex = IntStream.range(0, students.size())
                .filter(index -> students.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex > -1) {
            students.set(studentIndex, student);
            return student;
        }
        return null;
    }

    public void deleteStudent(String email) {
        Student student = findByEmail(email);
        if (student == null) return;
        students.remove(student);
    }
}
