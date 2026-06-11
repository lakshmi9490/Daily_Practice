package com.java.collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

public class Generics {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
//		al.add(49.5);
		
//		legacy class
		Stack<Integer> s = new Stack<Integer> ();
		s.add(10);
		s.add(10);
		s.add(10);
		s.add(10);
		s.add(10);
		System.out.println(s);
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1,"Apple");
		ht.put(2,"Mango");
		System.out.println(ht);

	}

}
