package com.jsp.model;

public class Employee {
	private int id;
	private String name;
	private String design ;
	private int salary;
	
	
	public Employee() {
		
	}
	
	public Employee(String name, String design, int salary) {
		super();
		this.name = name;
		this.design = design;
		this.salary = salary;
	}

	public Employee(int id, String name, String design, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.design = design;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return  id + " " + name + " " + design + " " + salary;
	}
	
	
}
