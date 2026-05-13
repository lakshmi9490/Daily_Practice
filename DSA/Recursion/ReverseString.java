package com.java.recursion;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String r = "";
		System.out.println(reverString(s,r,s.length()-1));
		sc.close();
		
	}
	static String reverString(String s, String r, int i) {
		if(i<0) {
			return r;
		}
		return (reverString(s, r+s.charAt(i), i-1));
	}

}
