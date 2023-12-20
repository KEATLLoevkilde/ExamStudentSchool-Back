package com.example.examstudentschool.school.model;

import com.example.examstudentschool.student.model.Student;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schoolId;
    private String schoolName;
    private String schoolAddress;

    @OneToMany(mappedBy = "school")
    @JsonBackReference
    private Set<Student> students = new HashSet<>();
}
