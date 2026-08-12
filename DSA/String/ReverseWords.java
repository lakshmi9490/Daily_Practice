package com.java.string;

public class ReverseWords {

	public static void main(String[] args) {
		
		String s = "Java is fun";
		
		System.out.println("Reverse words : "+ reverseWords(s));
	}
	public static StringBuilder reverseWords(String s) {
		String [] words = s.trim().split("\\s+");
		StringBuilder result = new StringBuilder();
		
		for(int i = words.length-1; i >= 0 ; i--) {
			result.append(words[i]);
			if(i > 0 ) {
				result.append(" ");
			}
		}
		
		return result;
	}

}
