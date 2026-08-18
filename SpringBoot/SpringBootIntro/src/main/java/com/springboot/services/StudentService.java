package com.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.entity.Student;
import com.springboot.repo.StudentRepo;

@Component
public class StudentService {
	@Autowired
	StudentRepo sr;
	
	public List<Student> bringAllStudents() {
		return (List<Student>)sr.findAll();
	}
}
