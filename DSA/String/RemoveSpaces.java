package com.java.string;

public class RemoveSpaces {

	public static void main(String[] args) {
		System.out.println(removeSpaces("a b c d"));
		System.out.println(removeSpaces("java      programming"));

	}
	public static String removeSpaces(String s) {
		char ar [] = s.toCharArray();
		int write = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] != ' ') {
				ar[write] = ar[i];
				write++;
			}
		}
		return new String(ar,0,write);
	}

}
