package com.springboot.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>{

}
