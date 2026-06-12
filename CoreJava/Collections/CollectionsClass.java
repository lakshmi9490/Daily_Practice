package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(51);
		al.add(97);
		al.add(12);
		al.add(45);
		al.add(38);
		System.out.println(al);
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
		System.out.println(Collections.frequency(al, 12));
		
		Collections.sort(al);
		System.out.println(al);
		

	}

}
