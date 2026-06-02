package com.java.collections;

import java.util.ArrayList;

public class BoxingAndAutoBoxing {

	public static void main(String[] args) {
		int a = 100;
		
		Integer i = new Integer(a);//Boxing
		Integer b = a;//Auto-Boxing
		
		System.out.println(a);
		System.out.println(b);
		
		Integer k = Integer.valueOf(200);
		int m = k.intValue();//UnBoxing
		int n = k;//Auto-UnBoxing
		
		
		System.out.println(m);
		System.out.println(n);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.clear();
		

	}

}
