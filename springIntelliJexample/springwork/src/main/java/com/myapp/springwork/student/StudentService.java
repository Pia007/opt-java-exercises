package com.myapp.springwork.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
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

    // P14 -
        // Transactional annotation - manages the state, the entity goes into a manages state
    @Transactional
    public void updateStudent(Long studentId, String name, String email) {

        // check if student with that id exists
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException(
                        "student with id " + studentId + " does not exist"));

        // check if name is not null, has length, that name provided is not the same as the current one
        if ( name != null && name.length() > 0 && !Objects.equals(student.getName(), name)) {
            // setName to the provided name, if all conditions met
            student.setName(name);
        }

        // check if email is not null, has length and is not the same as the current email
        if (email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)) {
            // if all conditions met, check if the provided email already exist in the student repo
            Optional<Student> studentOptional = studentRepository
                    .findStudentByEmail(email);
            if (studentOptional.isPresent()) {
                // if it does exist
                throw new IllegalStateException("email taken");
            }
            // otherwise set the student email to the provided one
                // NOTE: no need for a query bc of the @Transactional annotation
            student.setEmail(email);
        }
    }
}
