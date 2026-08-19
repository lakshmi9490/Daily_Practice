package com.springbootcurd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcurd.entity.Student1;
import com.springbootcurd.services.MyService;

@RestController
public class MyController {
	@Autowired
	MyService ms;
	
	@GetMapping("/getAllStudents")
	List<Student1> getAllSudents() {
		return ms.bringAllStudents();
	}
	
	@GetMapping("/getOne/{id}")
	Student1 getStudentById(@PathVariable("id") int sid){
		return ms.bringStudentById(sid);
	}
	
	@PutMapping("/insert")
	void insert(@RequestBody Student1 s) {
		ms.insert(s);
	}
	
	@DeleteMapping("/delete/{id}")
	String delete(@PathVariable("id") int sid) {
		return ms.deleteStudent(sid);
	}
	
	@PostMapping("/update/{id}")
	String update(@PathVariable("id") int sid,@RequestBody Student1 s) {
		return ms.update(sid,s);
	}
}
