package com.java.string;

import java.util.Arrays;

public class AnagramCheck {
	public static boolean isAnagram(String s1,String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		char [] ar1  = s1.toCharArray();
		char [] ar2  = s2.toCharArray();
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		int left = 0 , right = ar1.length - 1 ;
		
		while(left<=right) {
			if(ar1[left]!=ar2[left] || ar1[right]!=ar2[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "silent"));

	}

}
