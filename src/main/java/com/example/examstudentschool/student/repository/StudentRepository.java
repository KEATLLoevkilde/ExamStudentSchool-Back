package com.example.examstudentschool.student.repository;

import com.example.examstudentschool.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
