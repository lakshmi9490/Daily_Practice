package com.java.oops;

import java.util.Scanner;

//POJO : Pain Old Java Object.
class Employee{
	private int eId;
	private String eName;
	private int ePhone;
	private int eSalary;
	private String eAddress;
	
	public Employee(){
		
	}
	public Employee(int eId,String eName,int ePhone,int eSalary,String eAddress) {
		this.eId = eId;
		this.eName = eName;
		this.ePhone = ePhone;
		this.eSalary = eSalary;
		this.eAddress = eAddress;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getePhone() {
		return ePhone;
	}
	public void setePhone(int ePhone) {
		this.ePhone = ePhone;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	public String geteAddress() {
		return eAddress;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	
	
	
}
public class PojoClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of object you want to create : ");
		int n = sc.nextInt();
		Employee a[] = new Employee[n];
		for(int i=0;i<n;i++) {
		
			Employee e = new Employee();
			
//			System.out.println("Enter the Id : ");
//			int eId = sc.nextInt();
//			System.out.println("Enter the Name : ");
//			String eName = sc.next();
//			System.out.println("Enter the Phone No :");
//			int ePhone = sc.nextInt();
//			System.out.println("Enter the Salary");
//			int eSalary = sc.nextInt();
//			System.out.println("Enter the Address");
//			String eAddress = sc.next();
			
			System.out.println("Enter the Data");
			
			String data = sc.next();
			String arr[] =  data.split(",");
		    int eId = Integer.parseInt(arr[0]);
		    int ePhone = Integer.parseInt(arr[2]);
		    int eSalary = Integer.parseInt(arr[3]);
		    
			
			e.seteId(eId);
			e.seteName(arr[1]);
			e.setePhone(ePhone);
			e.seteSalary(eSalary);
			e.seteAddress(arr[4]);
			
			a[i] = e;
			
		}	
		
		for(Employee e:a) {
			System.out.println(e.geteId()+" "+e.geteName()+" "+e.getePhone()+
					" "+e.geteSalary()+" "+e.geteAddress());
		}
		
		
		
		sc.close();

	}

}
