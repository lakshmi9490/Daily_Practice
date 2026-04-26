package com.java.mathematics;

import java.util.Scanner;

public class HCFAndLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(lcm(a, b));
		sc.close();

	}
	public static int hcf(int a,int b) {
		while((a != 0) && (b != 0)) {
			if( a > b) {
				a = a%b;
			}
			else {
				b = b%a;
			}
		}
		if(a!=0) {
			return a;
		}
		else {
			return b;
		}
	}
	public static int lcm(int a,int b) {
		return (a*b)/hcf(a,b);
	}

}
