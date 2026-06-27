package com.java.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(reverse(s));
		
		sc.close();
	}
	public static  String reverse (String s) {
		
		char ch[]  = s.toCharArray();
		int l = 0;
		int r = s.length()-1;
		while(l<r) {
			char temp = ch[l];
			ch[l] = ch[r];
			ch[r] = temp;
			l++;
			r--;
		}
		return new String(ch);
	}
	

}
