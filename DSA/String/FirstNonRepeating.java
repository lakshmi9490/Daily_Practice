package com.java.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {

	public static void main(String[] args) {
		String s1 = "swiss";
		String s2 = "aabbcc";
		
		Character result1 = nonRepeatingCharacter(s1);
		Character result2 = nonRepeatingCharacter(s2);
		
		System.out.println("First non-repeating in \""+s1+"\": "+(result1 != null ? result1 : "None"));
		System.out.println("First non-repeating in \""+s2+"\": "+(result2 != null ? result1 : "None"));
		
	}
	public static Character nonRepeatingCharacter(String s) {
		Map<Character,Integer> nonRepeat = new LinkedHashMap<Character,Integer>();
		
		for(char c : s.toCharArray()) {
			nonRepeat.put(c, nonRepeat.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry :nonRepeat.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		
		return null;
		
	}

}
