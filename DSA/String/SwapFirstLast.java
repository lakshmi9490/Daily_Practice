package com.java.string;

public class SwapFirstLast {

	public static void main(String[] args) {
		String s = "Java";
		String s1 = "Programming";
		System.out.println(swapFirstLast(s));
		System.out.println(swapFirstLast(s1));

	}
	public static String swapFirstLast(String s) {
		char first = s.charAt(0);
		char last = s.charAt(s.length()-1);
		
		String middle = s.substring(1,s.length()-1);
		
		return last+middle+first;
	}

}
