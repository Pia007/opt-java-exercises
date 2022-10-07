package com.myapp.springwork.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// Data Access Layer
//Part 8 create interface for interaction with db
    // Student and the type of the id
//P12
@Repository
public interface StudentRepository extends JpaRepository<Student, Long > {

    //P12 find by email
    // Same as SELECT * FROM student WHERE email =?
    // can annotate it
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
