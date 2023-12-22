package com.example.examstudentschool.school.service.impl;

import com.example.examstudentschool.school.model.School;
import com.example.examstudentschool.school.repository.SchoolRepository;
import com.example.examstudentschool.school.service.SchoolService;
import com.example.examstudentschool.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public School getSchoolById(int id) {
        Optional<School> optionalSchool = schoolRepository.findById(id);
        return optionalSchool.orElse(null);
    }

    @Override
    public School createSchool(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public School updateSchool(int id, School updatedSchool) {
        if (schoolRepository.existsById(id)) {
            updatedSchool.setSchoolId(id);
            return schoolRepository.save(updatedSchool);
        }
        return null;
    }

    @Override
    public void deleteSchool(int id) {
        schoolRepository.deleteById(id);
    }
}
