package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Student;
import com.springboot.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService ss;
	
	@GetMapping("/getStudent")
	List<Student> getAllStudents() {
		return ss.bringAllStudents();
	}
}
