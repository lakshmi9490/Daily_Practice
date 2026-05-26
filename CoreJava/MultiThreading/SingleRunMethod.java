package com.java.multithreading;
/*
 * If exception in one thread only that one thread is terminated remaining thread 
 * continues the process.
 */
import java.util.Scanner;

class Demo extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		if(t.getName().equals("PrintChar")) {
			printChar();
		}
		else if(t.getName().equals("PrintNum")) {
			printNum();
		}
		else {
			divide();
		}
	}
	void printChar() {
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
	void printNum() {
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
	void divide() {
		System.out.println("Dividing Numbers Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("Dividing Numbers Ended");
		sc.close();
	}
}
public class SingleRunMethod {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();

		d1.setName("PrintChar");
		d2.setName("PrintNum");
		d3.setName("AddingNum");
		
		d1.start();
		d2.start();
		d3.start();
	}

}
