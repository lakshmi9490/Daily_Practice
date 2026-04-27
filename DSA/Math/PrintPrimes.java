package com.java.mathematics;

import java.util.Scanner;

public class PrintPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPrimes1(n);
		sc.close();

	}
	public static void printPrimes(int n) {
		boolean [] prime = new boolean [n+1];
		for(int i=2;i<=n;i++) {
			if(prime[i] == false) {
				for(int j=i*2;j<=n;j=j+i) {
					prime[j] = true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(prime[i]==false) {
				System.out.println(i);
			}
		}
	}
	public static void printPrimes1(int n) {
		boolean [] prime = new boolean [n+1];
		for(int i=2;i*i<=n;i++) {
			if(prime[i]==false) {
				for(int j=i*i;j<=n;j=j+i) {
					prime[j] = true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(prime[i]==false)
			System.out.println(i);
		}
	}

}
