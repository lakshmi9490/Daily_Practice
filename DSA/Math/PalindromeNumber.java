package com.java.mathematics;

import java.util.Scanner;

public class PalindromeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int x = new Scanner(System.in).nextInt();
		System.out.println(isPlaindrome(x));

	}
	public static boolean isPlaindrome(int x) {
		if(x <= 0| x%10 == 0 ) {
			return false;
		}
		int original = x;
		int rev = 0;
		while(x>0) {
			rev *= 10;
			rev = rev + x%10;
			x /= 10;
		}
		if(original == rev) {
			return true;
		}
		return false;
	}

}
