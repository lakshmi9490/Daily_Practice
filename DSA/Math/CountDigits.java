package com.java.mathematics;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countDigits(n));
		sc.close();

	}
	public static int countDigits(int n) {
		int count = 0;
		
		if(n>0) {
			while(n>0) {
				n /= 10;
				count++;
			}
		}else {
			while(n<0) {
				n /= 10;
				count++;
			}
		}
		return count;
	}

}
