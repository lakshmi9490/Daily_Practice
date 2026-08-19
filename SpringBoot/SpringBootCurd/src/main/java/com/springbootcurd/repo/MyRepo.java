package com.springbootcurd.repo;

import org.springframework.data.repository.CrudRepository;

import com.springbootcurd.entity.Student1;

public interface MyRepo extends CrudRepository<Student1, Integer>{
	Student1 findById(int id);
}
