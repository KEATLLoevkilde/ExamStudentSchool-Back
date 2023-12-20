package com.example.examstudentschool.school.repository;

import com.example.examstudentschool.school.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
