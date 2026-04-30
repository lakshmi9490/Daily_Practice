package com.java.methodoverloading;
/* MethodOverLoading : multiple method with same name in same class
 * It's also called as the compile time polymorphism,early binding,static binding.
 */
public class MethOverLoading {

	public static void main(String[] args) {
//		Calculator c = new Calculator();
//		c.add(5,6);
//		c.add(5,7,8);
//		c.add(3,5.89f,34.89);
//		c.add(4,36.7);
		
		//Calculator1 c = new Calculator1();
		//c.add('A','B');
	 

	}

}

class Calculator{
	public void add() {
		System.out.println(10+20);
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,float b) {
		System.out.println(a+b);
	}
	public void add(int a,double b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void add(int a,int b,float c) {
		System.out.println(a+b+c);
	}
	public void add(int a,int b,double c) {
		System.out.println(a+b+c);
	}
	public void add(int a,float b,double c) {
		System.out.println(a+b+c);
	}
}

class Calculator1{
	public void add(int a,char b) {
		System.out.println("int , int");
	}
	public void add(char a,int b) {
		System.out.println("char , int");
	}
}
