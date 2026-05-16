package com.java.exception;

import java.util.Scanner;
/*
 * 1.The problem that happens during the execution of a java program is called an Exception.
 * 2.These exception can cause the program to abruptly terminate, which can be problematic
 * for smooth functioning.
 * 3.The process of avoiding the abrupt termination of the program is only called Exception Handling.
 */
public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Connection Established");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the numerator");
			int a = sc.nextInt();
			System.out.println("Enter the denominator");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("Enter the size of array");
			int size = sc.nextInt();
			int ar[] = new int[size];
			System.out.println("Enter the  value");
			int value = sc.nextInt();
			System.out.println("Enter the index");
			int index = sc.nextInt();
			ar[index] = value;
			System.out.println(ar[index]);
			System.out.println(c);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	    System.out.println("Connection Terminated");	
	    sc.close();

	}

}
