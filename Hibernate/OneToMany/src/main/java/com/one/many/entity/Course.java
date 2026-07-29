package com.one.many.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cId")
	private int cId;
	
	@Column(name="courseName")
	private String courseName;
	
	@Column(name="hours")
	private int hours;
	
	@ManyToOne
	@JoinColumn(name = "sId")
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course() {
		super();
	}

	public Course(String courseName, int hours) {
		super();
		this.courseName = courseName;
		this.hours = hours;
	}

	public Course(int cId, String courseName, int hours) {
		super();
		this.cId = cId;
		this.courseName = courseName;
		this.hours = hours;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return  cId + " " + courseName + " " + hours + " " + student ;
	}
	

}
