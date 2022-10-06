package com.myapp.springwork.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// P5 - applied @Service annotation to StudentServices, same as @Component
    // Spring will scan and identify it as a Bean and autowire it where indicated
@Service
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
