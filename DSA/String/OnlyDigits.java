package com.java.string;

public class OnlyDigits {

	public static void main(String[] args) {
		String s1 = "12345";
		String s2 = "12a45";
		
		System.out.println("Is \""+s1+"\" only digits? "+containsOnlyDigits(s1));
		System.out.println("Is \""+s2+"\" only digits? "+containsOnlyDigits(s2));
		

	}
	public static boolean containsOnlyDigits(String s) {
		for(char c:s.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

}
