package com.java.string;

public class CountWords {
	public static void main(String[] args) {
		String s = "Java is fun to learn";
		
		System.out.println(countWords(s));
		
	}
	public static int countWords(String s) {
		String [] words = s.trim().split("\\s+");
		
		return words.length;
	}
}
