package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class StudentService {
    


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
