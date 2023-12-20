package com.example.examstudentschool.student.service.impl;

import com.example.examstudentschool.student.model.Student;
import com.example.examstudentschool.student.repository.StudentRepository;
import com.example.examstudentschool.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(int studentId, Student updatedStudent) {
        if (studentRepository.existsById(studentId)) {
            updatedStudent.setStudentId(studentId);
            return studentRepository.save(updatedStudent);
        }
        return null;
    }

//    @Override
//    public Student updateStudent(int studentId, Student updatedStudent) {
//        Optional<Student> existingStudentOptional = studentRepository.findById(studentId);
//        if (existingStudentOptional.isPresent()) {
//            Student existingStudent = existingStudentOptional.get();
//            existingStudent.setName(updatedStudent.getName());
//            existingStudent.setBornDate(updatedStudent.getBornDate());
//            return studentRepository.save(existingStudent);
//        }
//        return null;
//    }

    @Override
    public void deleteStudent(int studentId) {
        studentRepository.deleteById(studentId);
    }
}
