package com.java.bitmanipulation;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findindEvenNumber(n));
		sc.close();
	}
	public static String findindEvenNumber(int n) {
		int mask = 1;
		if(n>0) {
			if((n & mask ) == 0) {
				return "Even";
			}else {
			    return "Odd";
			}
			
		}
		return "Error";
		
	}

}
