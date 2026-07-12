package com.java.string;

import java.util.Scanner;

public class ReverseVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		System.out.println(reverseVowels(s));
		sc.close();
	}
	public static String reverseVowels(String s) {
		char [] ar  = s.toCharArray();
	
		int left=0,right = s.length()-1;
		
		while(left<=right) {
			char temp = ' ';
			while(left < right && !isVowel(ar[left])) {
				left++;
				
			}
			while(left < right && !isVowel(ar[right])) {
				right--;
			}
			temp = ar[left];
			ar[left] = ar[right];
			ar[right] = temp;
			left++;
			right--;
			
		}
		return new String(ar,0,ar.length);
	}
	
//	public static boolean isVowel(char c) {
//		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
//		   c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' 
//				) {
//			return true;
//		}
//		return false;
//	}
	
	public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

}
