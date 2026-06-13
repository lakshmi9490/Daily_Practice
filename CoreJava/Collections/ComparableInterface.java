package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//Pojo Class
class Employee implements Comparable<Employee>{
	private int id;
	private String name ;
	private String email;
	private String department;
	private int salary;
	
	public Employee() {

	}

	public Employee(int id, String name, String email, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		
		return id+" "+name+" "+email+" "+department+" "+salary;
	}


	@Override
	public int compareTo(Employee e2) {
		Employee e1 = this;
		Integer id1 = e1.id;
		Integer id2 = e2.id;
		
		return id1.compareTo(id2);
	}
	
}
public class ComparableInterface {
	public static void main(String []args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the details of employee "+i+1);
			Employee e = new Employee();
			String data = sc.nextLine();
			String arr [] = data.split(",");
			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setEmail(arr[2]);
			e.setDepartment(arr[3]);
			e.setSalary(Integer.parseInt(arr[4]));
			
			al.add(e);
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		sc.close();
	}
}
