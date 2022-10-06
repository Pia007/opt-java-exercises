package com.myapp.springwork;

import com.myapp.springwork.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
// Part 1b - implement an endpoint to see at localhost:8080
@RestController
public class SpringworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringworkApplication.class, args);
	}

	//1b add class RESTful endpoint
		// must be annotated with @GetMapping(get request from server)
		// Start the server to test
	// P2f  update to List students
	@GetMapping
	public  List<Student> hello() {
		return  List.of(
			new Student(
					1L,
					"Jordy",
					"jordy.demo@demo.com",
					LocalDate.of(1994, Month.MARCH, 5),
					21
			)
		);
	}
	// P2g start server and will an array with one obj
}
