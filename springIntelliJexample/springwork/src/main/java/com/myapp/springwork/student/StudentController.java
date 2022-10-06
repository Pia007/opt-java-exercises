package com.myapp.springwork.student;

//Part3 Student controller - all resources for the API. see Application

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// P3a
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    //P3b
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Jordy",
                        "jordy.demo@demo.com",
                        LocalDate.of(1994, Month.MARCH, 21),
                        28
                )
        );
    }
}
