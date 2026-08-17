package com.java.string;

public class LargestWord {

	public static void main(String[] args) {
		String s = "Java programming is powerful";
		System.out.println("Largest word : " + largestWord(s));

	}
	public static String largestWord(String s) {
		String [] words = s.trim().split("\\s+");
		String largest = "";
		for(String word:words) {
			if(word.length()>largest.length()) {
				largest = word;
			}
		}
		return largest;
	}

}
