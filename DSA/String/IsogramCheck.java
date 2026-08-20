package com.java.string;

import java.util.HashSet;
import java.util.Set;

public class IsogramCheck {

	public static void main(String[] args) {
		String s1 = "Programming";
		String s2 = "machine";
		
		System.out.println("Is \""+s1+"\" an isogram? " + isIsogram(s1));
		System.out.println("Is \""+s1+"\" an isogram? " + isIsogram(s2));

	}
	public static boolean isIsogram(String s) {
		s = s.toLowerCase().replaceAll("\\s+","");
	    Set<Character> seen = new HashSet<Character> ();
	    
	    for(char c : s.toCharArray()) {
	    		if(seen.contains(c)) {
	    			return false;
	    		}else {
	    			seen.add(c);
	    		}
	    }
	    return true;
	}

}
