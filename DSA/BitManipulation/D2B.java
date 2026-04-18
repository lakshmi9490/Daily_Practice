package com.java.bitmanipulation;

import java.util.Scanner;

public class D2B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String binary = decimalToBinary(n);
		
		System.out.println(binary);
		System.out.println(binaryToDecimal(binary));
		sc.close();
	}
	public static String decimalToBinary(int n) {
		String b = "";
		while(n>=1) {
			int x = n%2;
			n = n/2;
			b = x + b;
		}
		return b;
	}
	public static int binaryToDecimal(String b) {
		int result = 0;
		int powerOf2 = 1;
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)=='1') {
				result = result + powerOf2;
			}
			powerOf2 *= 2;
		}
		return result;
	}

}
