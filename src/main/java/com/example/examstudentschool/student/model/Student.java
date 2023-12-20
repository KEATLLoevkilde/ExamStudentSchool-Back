package com.example.examstudentschool.student.model;

import com.example.examstudentschool.school.model.School;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String name;
    private LocalDate bornDate;

    @ManyToOne
    @JoinColumn(referencedColumnName = "schoolId", name = "school_id")
    School school;
}
