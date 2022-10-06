package com.myapp.springwork.student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    //P4 b - edit to use the method from student service
    // P4c fields
    private final StudentService studentService;

    // P4d constructor
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // P4e - edit to use StudentServices
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
