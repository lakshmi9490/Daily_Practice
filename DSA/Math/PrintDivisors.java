package com.java.mathematics;

import java.util.Scanner;

public class PrintDivisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printDivisors(n);
		sc.close();

	}
	public static void printDivisors(int n) {
		int i=0;
		for(i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		for(i=i-1;i>=1;i--) {
			if(n%i==0 && i!=n/i) {
				System.out.println(n/i);
			}
		}
	}

}
