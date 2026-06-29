package com.java.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		String s = new Scanner(System.in).nextLine();
	    System.out.println(isPalindrome(s));

	}
	public static boolean isPalindrome(String s) {
		int l = 0;
		int r = s.length()-1;
		while(l<r) {
			if(s.charAt(l)!=s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

}
