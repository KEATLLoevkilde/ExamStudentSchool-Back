package com.example.examstudentschool.school.controller;

import com.example.examstudentschool.school.model.School;
import com.example.examstudentschool.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schools")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @GetMapping("/{id}")
    public School getSchoolById(@PathVariable int id) {
        return schoolService.getSchoolById(id);
    }

    @PostMapping
    public School createSchool(@RequestBody School school) {
        return schoolService.createSchool(school);
    }

    @PutMapping("/{id}")
    public School updateSchool(@PathVariable int id, @RequestBody School updatedSchool) {
        return schoolService.updateSchool(id, updatedSchool);
    }

    @DeleteMapping("/{id}")
    public void deleteSchool(@PathVariable int id) {
        schoolService.deleteSchool(id);
    }
}
