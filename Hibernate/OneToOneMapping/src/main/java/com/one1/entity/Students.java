package com.one1.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Students {
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
	
	
	public StudentDetails getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}

	public Students() {
		super();
	}

	public Students(String sName, String sEmail, String mobile) {
		super();
		this.sName = sName;
		this.sEmail = sEmail;
		this.mobile = mobile;
	}

	public Students(int sId, String sName, String sEmail, String mobile) {
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
