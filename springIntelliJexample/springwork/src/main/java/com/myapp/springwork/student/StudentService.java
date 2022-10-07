package com.myapp.springwork.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

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
        //P12b
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        // save the student if the email is not given
        if (studentOptional.isPresent()) {
            throw new IllegalStateException(" email taken");
        }
        studentRepository.save(student);

        System.out.println(student);
    }

    //P13 b -
    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("student with id " + studentId + " does not exists");
        }
        studentRepository.deleteById(studentId);
    }
}
