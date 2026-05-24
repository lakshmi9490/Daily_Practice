package com.java.multithreading;
/*
 * 
 */

import java.util.Scanner;

public class ImplementingRunnable {

	public static void main(String[] args) {
		Exp1 e1 = new Exp1();
		Exp2 e2 = new Exp2();
		Exp3 e3 = new Exp3();
		
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(e2);
		Thread t3 = new Thread(e3);
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
class Exp1 implements Runnable{
	@Override
	public void run() {
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
		
	}
}
class Exp2 implements Runnable{
	@Override
	public void run() {
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
		
	}
}
class Exp3 implements Runnable{
	@Override
	public void run() {
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
