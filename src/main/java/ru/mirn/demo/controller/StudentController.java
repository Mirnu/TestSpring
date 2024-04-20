package ru.mirn.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.mirn.demo.model.Student;
import ru.mirn.demo.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @GetMapping
    public List<Student> findAllStudent() {
        return studentService.findAllStudent();
    }
    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return studentService.findByEmail(email);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable String email) {
        studentService.deleteStudent(email);
    }
}
