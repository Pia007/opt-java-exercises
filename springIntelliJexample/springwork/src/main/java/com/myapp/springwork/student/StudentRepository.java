package com.myapp.springwork.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Data Access Layer
//Part 8 create interface for interaction with db
    // Student and the type of the id
@Repository
public interface StudentRepository extends JpaRepository<Student, Long > {
}
