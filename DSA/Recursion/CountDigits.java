package com.java.recursion;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println(countDigits(n));
		sc.close();

	}
	public static int countDigits(int n) {
		if(n==0) {
			return 0;
		}
		return countDigits(n/10)+1;
	}

}
