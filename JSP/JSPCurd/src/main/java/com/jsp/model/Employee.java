package com.jsp.model;

public class Employee {
	private int empId;
	private String name;
	private String design;
	private String salary;
	
	
	public Employee() {

	}

	public Employee(String name, String design, String salary) {
		super();
		this.name = name;
		this.design = design;
		this.salary = salary;
	}

	public Employee(int empId, String name, String design, String salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.design = design;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
		return  empId + " " + name + " " + design + " " + salary ;
	}
	

	
	
}
