package com.java.string;

public class ReverseEveryWord {

	public static void main(String[] args) {
		String s = "Java is fun";
		System.out.println("Reversed words :" +reverseWords(s));

	}
	public static String reverseWords(String s) {
		StringBuilder result = new StringBuilder();
		String words[] = s.split("\\s+");
		
		for(String word : words) {
			result.append(new StringBuilder(word).reverse().toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

}
