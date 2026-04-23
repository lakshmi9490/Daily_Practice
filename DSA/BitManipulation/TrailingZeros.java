package com.java.bitmanipulation;

import java.util.Scanner;

public class TrailingZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(trailingZeros(n));
		System.out.println(trailingZeros1(n));
		sc.close();

	}
	static int trailingZeros(int n ) {
		return (int) (Math.log10(n ^ (n & (n-1)))/Math.log10(2));
	}
	static int trailingZeros1(int n) {
		int m = 1;
		int pos = 0;
		while((n&m)==0) {
			m = m << 1;
			pos++;
		}
		return pos;
	}

}
