package com.example.examstudentschool.config;

import com.example.examstudentschool.school.model.School;
import com.example.examstudentschool.student.model.Student;
import com.example.examstudentschool.school.service.SchoolService;
import com.example.examstudentschool.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private StudentService studentService;

    @Override
    public void run(String... args) throws Exception {
        createSchoolInstances();
        createStudentInstances();
    }

    private void createSchoolInstances() {
        for (int i = 1; i <= 3; i++) {
            School school = new School();
            school.setSchoolName("School " + i);
            school.setSchoolAddress("Address " + i);
            schoolService.createSchool(school);

        }
    }

    private void createStudentInstances() {
        for (int i = 1; i <= 3; i++) {
            Student student = new Student();
            student.setName("Student " + i);
            student.setBornDate(LocalDate.now().minusYears(i));
            student.setSchool(schoolService.getSchoolById(i));
            studentService.createStudent(student);
        }
    }
}
