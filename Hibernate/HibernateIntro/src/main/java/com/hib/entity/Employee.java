package com.hib.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "emp_id")
	private int empid;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "design")
	private String design;
	
	@Column(name = "salary")
	private String salary;
	
	
	public Employee() {
		super();
	}
	public Employee(int empid, String name, String design, String salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.design = design;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return  empid + " " + name + " " + design + " " + salary ;
	}
	
	
}
