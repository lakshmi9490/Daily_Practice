package com.springbootcurd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbootcurd.entity.Student1;
import com.springbootcurd.repo.MyRepo;

@Component
public class MyService {
	@Autowired
	MyRepo mr;
	
	public List<Student1> bringAllStudents(){
		return (List<Student1>)mr.findAll();
	}

	public Student1 bringStudentById(int sid) {
		Student1 s = mr.findById(sid);
		if(s == null) {
			return null;
		}
		return s;
		
	}
	
	public void insert(Student1 s) {
		mr.save(s);
	}
	
	public String deleteStudent(int sid) {
		mr.delete(bringStudentById(sid));
		return "Success";
	}

	public String update(int sid, Student1 s) {
		Student1 s2 = mr.findById(sid);
		s2.setEmail(s.getEmail());
		s2.setName(s.getName());
		
		mr.save(s2);
		
		return "Success";
	}
	
	
}
