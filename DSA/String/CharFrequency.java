package com.java.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharFrequency {

	public static void main(String[] args) {
		String s = "banana";
		printCharFrequency(s);

	}
	public static void printCharFrequency(String s) {
		Map<Character,Integer> freq = new LinkedHashMap<Character,Integer>();
		for(char c:s.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0)+1);
		}
		
		
		for(Map.Entry<Character,Integer> entry:freq.entrySet()) {
			System.out.println(entry.getKey()+ " -> " +entry.getValue() );
		}
	}

}
