package com.example.examstudentschool.student.service;

import com.example.examstudentschool.student.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(int studentId);
    Student createStudent(Student student);
    Student updateStudent(int studentId, Student student);
    void deleteStudent(int studentId);
}
