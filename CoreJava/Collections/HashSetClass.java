package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 1.How to use.
 * 2.Heterogenous data can use.
 * 3.Duplicates are not allowed.
 * 4.Null value can store.
 * 5.Does not preserve order of insertion.
 * 6.Initial Capacity - 16;
 * -> it increase the capacity when it reach to the 75% it double the capacity.so load factor is 0.75
 * 7.Data Structure - Hash table.
 * 8.Constructors - 5
 * 9.Hierarchy
 * 10.Methods 
 * 11.Accessing the data.
 */
public class HashSetClass {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("Nani");
		hs.add(15.55f);
		hs.add(true);
		hs.add(null);
		hs.add(15);
		
	
		
		System.out.println(hs);
		
		for(Object o:hs) {
			System.out.print(o+" ");
		}
		System.out.println();
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
