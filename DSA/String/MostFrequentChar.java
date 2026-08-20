package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentChar {

	public static void main(String[] args) {
		String s= "successes";
		System.out.println("Most Frequent Character :"+mostFrequentChar(s));
	}
	public static Character mostFrequentChar(String s) {
		Map<Character,Integer> map = new HashMap<Character,Integer> ();
		for(char c:s.toCharArray()) {
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		char mostFrequence = '\0';
		int maxCount = 0;
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				mostFrequence = entry.getKey();
			}
			
		}
		return mostFrequence;
	}
}
