package com.java.bitmanipulation;

import java.util.Scanner;

public class ReverseBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(reverseBinary(n));
		sc.close();
	}
	public static int reverseBinary(int n) {
		int l = 0 ,f = 31 ,rev = 0;
		while(f > l) {
			if((n & (1<<f))!=0){
				rev = rev | (1<<l);
			}
			if((n & (1<<l))!=0) {
				rev = rev | (1<<f);
			}
			l++;
			f--;
			
		}
		return rev;
	}
	

}
