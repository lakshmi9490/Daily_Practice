package com.java.mathematics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = fact(n);
		System.out.println(res);
//		System.out.println(num(res,n));
		
		sc.close();
	}
	public static int fact(int n) {
		int result = 1;
		for(int i=1;i<=n;i++) {
			result *= i;
		}
		return result;
	}
//	public static int num(int res,int n ) {
//		for(int i=10;i>0;i--) {
//			res %= i;
//		}
//		return res;
//	}

}
