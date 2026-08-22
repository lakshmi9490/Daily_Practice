package com.java.string;

public class CountSpecialCharacter {

	public static void main(String[] args) {
		String s = "Hello@   World!";
		System.out.println("SpecialCharacterCount is : "+countSpecialCharacter(s));

	}
	public static int countSpecialCharacter(String s) {
		int count = 0;
		for(char c:s.toCharArray()) {
			if(!Character.isLetterOrDigit(c) && c != ' ') {
				count++;
			}
		}
		return count;
	}

}
