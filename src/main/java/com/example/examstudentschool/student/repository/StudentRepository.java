package com.example.examstudentschool.student.repository;

import com.example.examstudentschool.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findBySchoolSchoolId(int schoolId);

}
