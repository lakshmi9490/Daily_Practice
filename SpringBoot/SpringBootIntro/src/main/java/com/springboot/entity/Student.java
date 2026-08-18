package com.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(name = "sid")
	private int sId;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Student(int sId, String name, String email) {
		super();
		this.sId = sId;
		this.name = name;
		this.email = email;
	}
	public Student() {
		super();
	}
	
	
	
}
