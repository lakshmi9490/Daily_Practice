package com.java.oops;

import java.util.Scanner;

/*
 * An Interface is a collection of pure abstract methods inside an interface,
 * you have only method body with a signature without body.
 */
interface Calculator11{
	void add();
	void sub();
}
class MyCalculator1 implements Calculator11{
	@Override
	public void add() {
		int a = 300;
		int b = 100;
		int c = a + b;
		System.out.println(c);
	}
	@Override
	public void sub() {
		int a = 300;
		int b = 100;
		int c = a - b;
		System.out.println(c);
	}
}
class MyCalculator2 implements Calculator11{
	Scanner sc = new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("Enter the Number1:");
		int a = sc.nextInt();
		System.out.println("Enter the Number2:");
		int b = sc.nextInt();
		System.out.println(a+b);
	}
	@Override
	public void sub() {
		System.out.println("Enter the Number1:");
		int a = sc.nextInt();
		System.out.println("Enter the Number2:");
		int b = sc.nextInt();
		System.out.println(a-b);
	}
}
class MyCalculator3 implements Calculator11{
	Scanner sc = new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("Enter the Number1:");
		int a = sc.nextInt();
		System.out.println("Enter the Number2:");
		int b = sc.nextInt();
		
		if(a<b) {
			System.out.println(a+b);
		}
		else {
			System.exit(0);
		}
	}
	@Override
	public void sub() {
		System.out.println("Enter the Number1:");
		int a = sc.nextInt();
		System.out.println("Enter the Number2:");
		int b = sc.nextInt();
		System.out.println(a-b);
		
		if(a>b) {
			System.out.println(a-b);
		}else {
			System.exit(0);
		}
	}
}
class Casio{
	void permit(Calculator11 c) {
		c.add();
		c.sub();
	}
}
public class Interface {

	public static void main(String[] args) {
		MyCalculator1 m1 = new MyCalculator1 ();
		MyCalculator2 m2 = new MyCalculator2 ();
		MyCalculator3 m3 = new MyCalculator3 ();
		
		Casio c = new Casio();
		c.permit(m1);
		c.permit(m2);
		c.permit(m3);
		

	}

}
