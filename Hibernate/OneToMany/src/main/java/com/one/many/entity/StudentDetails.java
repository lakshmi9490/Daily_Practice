package com.one.many.entity;

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
@Table(name="student_details")
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sdId")
	private int sdId;
	@Column(name = "area")
	private String area;
	@Column(name = "city")
	private String city;
	@Column(name = "pincode")
	private String pincode;
	 
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sId")
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public StudentDetails() {
		super();
	}
	public StudentDetails(String area, String city, String pincode) {
		super();
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	public StudentDetails(int sdId, String area, String city, String pincode) {
		super();
		this.sdId = sdId;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	public int getSdId() {
		return sdId;
	}
	public void setSdId(int sdId) {
		this.sdId = sdId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return  sdId + " " + area + " " + city + " " + pincode ;
	}
	
	
}
