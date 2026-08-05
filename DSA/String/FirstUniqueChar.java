package com.java.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {

	public static void main(String[] args) {
		String s = "swetharasi";
		firstUniqueChar(s);

	}
	public static void firstUniqueChar(String s) {
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for(char c: s.toCharArray()) {
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
			     System.out.println(entry.getKey());
			     break;
			}
			
		}
	
	}

}
