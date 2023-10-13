package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
	public List<Student> getStudents(){
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
