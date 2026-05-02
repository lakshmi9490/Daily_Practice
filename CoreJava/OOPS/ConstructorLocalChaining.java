package com.java.oops;
class Student{
	private int sId;
	private String sName;
	private int sAge;
	
	public Student() {
		this.sId = 1;
		this.sName = "Raju";
		this.sAge = 23;
	}
	public Student(String sName) {
		this();
		this.sName = sName;
	}
	public Student(int sId,String sName,int sAge) {
		this(sName);
		
		
	}

	public int getsId() {
		return sId;
	}

	public String getsName() {
		return sName;
	}

	public int getsAge() {
		return sAge;
	}


	
}
public class ConstructorLocalChaining {

	public static void main(String[] args) {
		Student s = new Student (2,"Nani",22);
		
		System.out.println(s.getsId()+" "+s.getsName()+" "+s.getsAge());

	}

}
