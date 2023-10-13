package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Student;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		// this is a rest endpoint
		// using list of made it look like json data
		return List.of(
			new Student(
				1L,
				"Mariam",
				"lamiaboualouache@gmail.com",
				LocalDate.of(1999, 07, 12),
				24
			)
		);
	}

}
