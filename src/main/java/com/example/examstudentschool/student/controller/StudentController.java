package com.example.examstudentschool.student.controller;

import com.example.examstudentschool.student.model.Student;
import com.example.examstudentschool.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") int studentId) {
        return studentService.getStudentById(studentId);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable("id") int studentId, @RequestBody Student updatedStudent) {
        return studentService.updateStudent(studentId, updatedStudent);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") int studentId) {
        studentService.deleteStudent(studentId);
    }
}
