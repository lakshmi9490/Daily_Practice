package com.java.string;

public class RemoveVowels {
	public static void main(String[] args) {
		String s = "beautiful";
		System.out.println("After removing vowels :"+ removeVowels(s));
	}
	public static String removeVowels(String s) {
		StringBuilder result = new StringBuilder();
		for(char c:s.toCharArray()) {
			if("aeiouAEIOU".indexOf(c) == -1) {
				result.append(c);
			}
		}
		return result.toString();
	}
}

