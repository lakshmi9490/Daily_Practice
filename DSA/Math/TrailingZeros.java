package com.java.mathematics;

import java.util.Scanner;

public class TrailingZeros {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(trailingZeors(n));
		
		sc.close();
	}
	public static  int trailingZeors(int n) {
		int res = 0;
		int powerOf5 = 5;
		while(n >= powerOf5) {
			res = res + (n/powerOf5);
			powerOf5 *= 5;
		}
		return res;
	}

}
