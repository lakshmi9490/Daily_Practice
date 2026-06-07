package com.java.collections;
import java.util.Iterator;
/*
 * Same as the HashSet just follows the order of insertion.
 * 
 */
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(50);
		ls.add(15);
		ls.add(20);
		
		System.out.println(ls);
		for(Object o :ls) {
			System.out.print(o+" ");
		}
		System.out.println();
		Iterator itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	

	}

}
