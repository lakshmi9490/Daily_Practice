package com.java.collections;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Demo1 implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();
		
		return id1.compareTo(id2);
	}
}

class Demo2 implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();
		
		return -1*id1.compareTo(id2);
	}
}
class Demo3 implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
}
class Demo4 implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		
		return e1.getEmail().compareTo(e2.getEmail());
	}
}
class Demo5 implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		
		return e1.getDepartment().compareTo(e2.getDepartment());
	}
}
class Demo6 implements Comparator<Employee1>{
	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		Integer sal1 = e1.getSalary();
		Integer sal2 = e2.getSalary();
		
		return sal1.compareTo(sal2);
	}
}

class Employee1 {
	private int id;
	private String name ;
	private String email;
	private String department;
	private int salary;
	
	public Employee1() {

	}

	public Employee1(int id, String name, String email, String department, int salary) {
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
	
}
public class ComparatorInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Sort by :\n1.Id(low to high) \n2.Id(high to low) \n3.Name \n4.Email \n5.Department \n6.Salary ");
		int sortBy = sc.nextInt();
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		Demo4 d4 = new Demo4();
		Demo5 d5 = new Demo5();
		Demo6 d6 = new Demo6();
		TreeSet<Employee1> ts =null;
		switch (sortBy) {
		case 1: 
			ts = new TreeSet<Employee1>(d1);
			break;
		case 2: 
			ts = new TreeSet<Employee1>(d2);
			break;
		case 3: 
			ts = new TreeSet<Employee1>(d3);
			break;
		case 4: 
			ts = new TreeSet<Employee1>(d4);
			break;
		case 5: 
			ts = new TreeSet<Employee1>(d5);
			break;
		case 6: 
			ts = new TreeSet<Employee1>(d6);
			break;
		default:
			break;	
		}
		System.out.println("Enter the number of employee : ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			Employee1 e = new Employee1();
			System.out.println("Enter the Data : ");
			String data = sc.nextLine();
			String arr [] = data.split(",");
			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setEmail(arr[2]);
			e.setDepartment(arr[3]);
			e.setSalary(Integer.parseInt(arr[4]));
			
			ts.add(e);
			
		}
		System.out.println(ts);
		
		sc.close();
	}
		

}
