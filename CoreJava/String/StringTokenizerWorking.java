package com.java.String;

import java.util.StringTokenizer;

public class StringTokenizerWorking {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Java Python DSA Mysql"," ");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
