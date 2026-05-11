package com.java.recursion;

import java.util.Scanner;

public class Fibonaccis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibonaccis(n));
		sc.close();

	}
	static int fibonaccis(int n) {
		if(n==1||n==2) {
			return 1;
		}
		return fibonaccis(n-1)+fibonaccis(n-2);
	}

}
