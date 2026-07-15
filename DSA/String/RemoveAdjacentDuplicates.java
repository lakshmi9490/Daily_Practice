package com.java.string;

import java.util.Scanner;

public class RemoveAdjacentDuplicates {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String s= new Scanner (System.in).nextLine();
		System.out.println(removeDuplicates(s));

	}
	public static String removeDuplicates(String s) {
		char ar[] = s.toCharArray();
		int write = 0;
		for(int read=0;read<ar.length;read++) {
			if(write ==0 ||ar[read] != ar[write-1]) {
				ar[write] = ar[read];
				write++;
			}
		}
		return new String (ar,0,write);
	}

}
