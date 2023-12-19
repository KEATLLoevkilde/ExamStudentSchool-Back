package com.example.examstudentschool.school.service;

import com.example.onetomanycrudbackend.school.model.School;

import java.util.List;

public interface SchoolService {
    List<School> getAllSchools();

    School getSchoolById(int id);

    School createSchool(School school);

    School updateSchool(int id, School school);

    void deleteSchool(int id);
}
