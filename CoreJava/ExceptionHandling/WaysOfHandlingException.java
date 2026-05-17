package com.java.exception;

import java.util.Scanner;

/*
 * 1.Handling Exception using try,catch.
 * 2.Re-throwing Exception using try,catch,throw,throws and finally.
 * 3.Ducking the Exception using throws.
 */
class Alpha{//Re-throwing
	void fun() throws Exception{
		Scanner sc =  new Scanner (System.in);
		try {
			System.out.println("Connection Established2");
			System.out.println("Enter the numerator");
			int a = sc.nextInt();
			System.out.println("Enter the denominator");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		}catch(Exception e){
			System.out.println("Handle in alpha");
			throw e;
		}
		finally {
			System.out.println("Connection Terminated2");
			sc.close();
		}
		
	}
}
class Beta{
	Scanner sc =  new Scanner (System.in);
	void fun() throws Exception{
		System.out.println("Connection Established2");
		System.out.println("Enter the numerator");
		int a = sc.nextInt();
		System.out.println("Enter the denominator");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("Connection Terminated2");
	}
}
public class WaysOfHandlingException {

	public static void main(String[] args) {
		System.out.println("Connetion Established1");
//		Alpha a = new Alpha();
//		a.fun();
//	    System.out.println("Handle in main");
		Beta b = new Beta();
		try {
			b.fun();
		}catch(Exception e){
			System.out.println("Handle in Exception");
		}
		
		System.out.println("Connection Terminated1");
	}

}
