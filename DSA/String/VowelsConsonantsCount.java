package com.java.string;

public class VowelsConsonantsCount {

	public static void main(String[] args) {
		String s = "Hello World";
		vowelsConsonentsCount(s);

	}
	public static void vowelsConsonentsCount(String s) {
		s = s.toLowerCase();
		int vowels = 0 ,consonants = 0;
		for(char c:s.toCharArray()) {
			if(Character.isLetter(c)) {
				if("aeiou".indexOf(c) != -1) {
					vowels++;
				}else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels = "+vowels + ", consonents = "+consonants);
	}

}
