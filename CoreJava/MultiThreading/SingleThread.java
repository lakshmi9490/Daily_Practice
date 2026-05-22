package com.java.multithreading;

import java.util.Scanner;

public class SingleThread {

	public static void main(String[] args) {
		System.out.println("Printing Characters Started");
		for(int i=65;i<=69;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Printing Characters Ended");
		
		System.out.println("Printing Numbers Started");
		for(int i=1;i<11;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Printing Numbers Ended");
		
		System.out.println("Adding Numbers Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println(a+b);
		sc.close();
		System.out.println("Adding Numbers Ended");
		

	}

}
