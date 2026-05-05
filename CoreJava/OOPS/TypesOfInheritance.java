package com.java.oops;
//1.Single Inheritance
class Parent{
	void readBook() {
		System.out.println("Reading book every day");
	}
}
class Child extends Parent {
	
}
//2.Multi_Inheritance 
class GrandMother{
	String color = "Brown";
	void cooking() {
		System.out.println("She cook all types of foods.");
	}
}
class Mother extends GrandMother{
	
}
class  Daughter extends Mother{
	
}

//3.Hierarchy Inheritance
class parent1{
	void height() {
		System.out.println("Height of him is 6.2 feets");
	}
}
class Child1 extends parent1{
	
}
class Child2 extends parent1{
	
}
class Child3 extends parent1{
	
}

//Hybrid Inheritance
class SuperSenior{
	void bestIn() {
		System.out.println("He is the best in the Maths.");
	}
}
class Senior extends SuperSenior{
	
}
class Junior1 extends Senior{
	
}
class Junior2 extends Senior{
	
}
class Junior3 extends Senior{
	
}
public class TypesOfInheritance {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.readBook();
		
		Daughter d = new Daughter();
		d.cooking();
		
		Child1 c1 =  new Child1();
		Child2 c2 =  new Child2();
		Child3 c3 =  new Child3();
		
		c1.height();
		c2.height();
		c3.height();
		
		Junior1 j1 = new Junior1();
		Junior2 j2 = new Junior2();
		Junior3 j3 = new Junior3();
		
		j1.bestIn();
		j2.bestIn();
		j3.bestIn();
	}

}
