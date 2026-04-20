package com.java.bitmanipulation;

import java.util.Scanner;

public class PosOfRMSB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(posOfRMSB(n));
		System.out.println(posOfRMSB1(n));
		sc.close();

	}
	public static int posOfRMSB1(int n ) {
		return (int) (Math.log10(n^(n&(n-1)))/Math.log10(2))+1;
	}
	public static int posOfRMSB(int n) {
		int mask = 1;
		int pos = 1;
		if (n==0) {
			return -1;
		}
		while((n & mask) == 0) {
			mask = mask << 1;
			pos++;
			
		}
		return pos;
	}

}
