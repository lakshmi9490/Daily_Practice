package com.java.multithreading;
/*
 * Multi-Threading is programming concept that allows a computer or software application
 * to execute multiple threads concurrently.
 * By this we can use cpu time efficiently.
 * 
 * program is a collection of instruction inside Hard Disk.
 * 
 * process/Task is the program which is under execution .
 * 
 */
import java.util.Scanner;

public class MultiThreads {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		d1.start();
		d2.start();
		d3.start();

	}

}
class Demo1 extends Thread{
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
class Demo2 extends Thread{
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
class Demo3 extends Thread{
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
