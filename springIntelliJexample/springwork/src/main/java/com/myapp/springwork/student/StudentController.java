package com.myapp.springwork.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    //P4 b - edit to use the method from student service
    // P4c fields
    private final StudentService studentService;

    // P4d constructor
    // P5 will not work because there is not an instance of student service
        // need to studentService field to be injected into controller
        // use dependency injection - @Autowired
            // instantiates and injects studentService into
        // must make sure the StudentService class is a Bean in order for
            // Spring to know that it should be autowired
            // use @Service, same as @Component
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // P4e - edit to use StudentServices
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    //P11 - post mapping

        // take the request body and map it to a student
    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    //P13
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    };
}
