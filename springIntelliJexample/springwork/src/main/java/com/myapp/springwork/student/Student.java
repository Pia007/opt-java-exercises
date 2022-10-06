package com.myapp.springwork.student;

import java.time.LocalDate;

//P2a - create the student model
public class Student {

    //P2b fields
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    // P2c constructors
    // no arg - constructor
    public Student() {
    }

    // everything constructor
    public Student(Long id,
                            String name,
                            String email,
                            LocalDate dob,
                            Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    // without the id - db will generate it

    public Student(String name,
                       String email,
                       LocalDate dob,
                       Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
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

    public Integer getAge() {
        return age;
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