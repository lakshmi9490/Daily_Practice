package com.one.many.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sId")
	private int sId;
	
	@Column(name = "sName")
	private String sName;
	
	@Column(name = "sEmail")
	private String sEmail;
	
	@Column(name = "mobile")
	private String mobile;
	
	@OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
	private StudentDetails studentDetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "sId")
	Set<Course>courses = new HashSet<Course> ();
	
	public void addCourse(Course course) {
		courses.add(course);
		course.setStudent(this);
	}
	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public StudentDetails getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}

	public Student() {
		super();
	}

	public Student(String sName, String sEmail, String mobile) {
		super();
		this.sName = sName;
		this.sEmail = sEmail;
		this.mobile = mobile;
	}

	public Student(int sId, String sName, String sEmail, String mobile) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sEmail = sEmail;
		this.mobile = mobile;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return  sId + " " + sName + " " + sEmail + " " + mobile ;
	}
	
	
	
}
