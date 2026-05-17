package com.java.exception;

import java.util.Scanner;

public class ExceptionWorking {

	public static void main(String[] args) {
		Demo4 d = new Demo4();
		d.fun4();

	}

}
class Demo1{
	void fun1() {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Connection Established1");
			System.out.println("Enter the numerator");
			int a = sc.nextInt();
			System.out.println("Enter the denominator");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		
		System.out.println("Connection Terminated1");
		sc.close();
		
	}
}
class Demo2{
	void fun2() {
		System.out.println("Connection Established2");
		Demo1 d = new Demo1();
		
		d.fun1();
		System.out.println("Connection Terminated2");
	}
}
class Demo3{
	void fun3() {
		System.out.println("Connection Established3");
		Demo2 d = new Demo2();
		
		try {
		d.fun2();
		}
		catch(Exception e) {
			System.out.println("Problem");
		}
		System.out.println("Connection Terminated3");
	}
}
class Demo4{
	void fun4() {
		System.out.println("Connection Established4");
		Demo3 d = new Demo3();
		d.fun3();
		System.out.println("Connection Terminated4");
	}
}