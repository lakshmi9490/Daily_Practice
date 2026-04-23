package com.java.bitmanipulation;

import java.util.Scanner;

public class SwapEvenOddBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(swapEvenOddBit(n));
		sc.close();
	}
	public static int swapEvenOddBit(int n) {
		return ((n & 0xaaaaaaaa)>>>1) | ((n & 0X55555555)<<1); 
	}

}
