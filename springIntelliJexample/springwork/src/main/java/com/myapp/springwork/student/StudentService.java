package com.myapp.springwork.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// P5 - applied @Service annotation to StudentServices, same as @Component
    // Spring will scan and identify it as a Bean and autowire it where indicated
// P8 use the Student Repository inside in StudentService
@Service
public class StudentService {

    // P8 field - student repo
    private final StudentRepository studentRepository;

    // P8 add the constructor, autowire it
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // update method to return all students
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    //P11b created add student method
    public void addNewStudent(Student student) {
        System.out.println(student);
    }
}
