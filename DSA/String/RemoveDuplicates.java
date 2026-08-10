package com.java.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s  = "programming";
		System.out.println(removeDuplicates(s));

	}
	public static StringBuilder removeDuplicates(String s) {
		StringBuilder result = new StringBuilder();
		Set<Character> seen = new HashSet<Character> ();
		
		for(char c : s.toCharArray()) {
			if(!seen.contains(c)) {
				seen.add(c);
				result.append(c);
			}
		}
		
		return result;
	}

}
