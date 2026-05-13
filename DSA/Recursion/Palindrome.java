package com.java.recursion;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(checkPalindrome(s, 0, s.length()-1));
		sc.close();

	}
	static boolean checkPalindrome(String s,int i,int j) {
		if(s.charAt(i)!=s.charAt(j)) {
			return false;
		}
		if(i>=j) {
			return true;
		}
		return checkPalindrome(s,i+1,j-1);
	}

}
