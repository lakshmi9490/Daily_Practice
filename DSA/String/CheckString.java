package com.java.string;

public class CheckString {

	public static void main(String[] args) {
		
		System.out.println(check("abcd", "dcba"));
	}
	public static boolean check(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		int left = 0 ,right = s1.length()-1;
		while(left<=right) {
			if(s1.charAt(left) != s2.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
