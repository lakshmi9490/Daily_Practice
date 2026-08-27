package com.java.string;

public class CountUpperLowerCase {

	public static void main(String[] args) {
		String s = "Programming";
		
		countLetters(s);

	}
	public static void countLetters(String s) {
		int upper =0, lower = 0;
		for(char c :s.toCharArray()) {
			if(Character.isUpperCase(c)) {
				upper++;
			}else if(Character.isLowerCase(c)) {
				lower++;
			}
		}
		
		System.out.println("Upper count :"+ upper);
		System.out.println("lower count :"+ lower);
	}
}
