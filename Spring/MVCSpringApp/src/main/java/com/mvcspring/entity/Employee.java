package com.mvcspring.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Component
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "eName")
	private String eName;
	@Column(name = "eEmail")
	private String eEmail;
	@Column(name = "eDesign")
	private String eDesign;
	@Column(name = "eAddress")
	private String eAddress;
	
	public Employee() {
		super();
	}
	public Employee(int id, String eName, String eEmail, String eDesign,String eAddress) {
		super();
		this.id = id;
		this.eName = eName;
		this.eEmail = eEmail;
		this.eDesign = eDesign;
		this.eAddress = eAddress;
	}
	public int getId() {
		return id;
	}
	public String geteAddress() {
		return eAddress;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteEmail() {
		return eEmail;
	}
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	public String geteDesign() {
		return eDesign;
	}
	public void seteDesign(String eDesign) {
		this.eDesign = eDesign;
	}
	@Override
	public String toString() {
		return  id + " " + eName + " " + eEmail + " " + eDesign+" "+eAddress ;
	}
	
	
	
}
