package com.myapp.springwork.student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

//P7 Map student to table in db
@Entity
@Table
public class Student {
    // create the sequence
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1   // increment of 1
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    //P2b fields
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;

   // P10 -  Store age based on calculation
        // @Transient - will no longer be a column in the db
    @Transient
    private Integer age;

    // no arg - constructor
    public Student() {
    }

    // everything constructor
    //P10 - remove age from constructors
    public Student(Long id,
                            String name,
                            String email,
                            LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    // without the id - db will generate it

    public Student(String name,
                       String email,
                       LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    //   P2d getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // P10b - calculate the age
        // calculate the age
    public Integer getAge() {

        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //  P2e toString override
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
