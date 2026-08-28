package com.java.string;

public class ReplaceVowels {

	public static void main(String[] args) {
	    String s1 = "Java";
        String s2 = "Programming";
        String s3 = "HELLO World";
		System.out.println("After replacing vowels : "+replaceVowels(s1));
		System.out.println("After replacing vowels : "+replaceVowels(s2));
		System.out.println("After replacing vowels : "+replaceVowels(s3));
	}
	public static String replaceVowels(String s) {
		return s.replaceAll("[aeiousAEIOU]","*");
	}

}
