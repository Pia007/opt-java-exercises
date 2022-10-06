package com.myapp.springwork.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//Part 4 - create student service
public class StudentService {

    // removed method from StudentController
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
