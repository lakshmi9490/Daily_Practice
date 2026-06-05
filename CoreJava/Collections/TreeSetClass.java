package com.java.collections;
import java.util.Iterator;
/*
 * 1.How to use
 * 2.Heterogenous data cannot store.
 * 3.Duplicate cannot store.
 * 4.Null value cannot store.
 * 5.Does not preserve order of insertion.
 * 6.Initial Capacity - 0.
 * 7.Constructors - 5.
 * 8.Hierarchy.
 * 9.Data  Structure -Balance Binary Tree Search.
 * 10.Methods in the Tree Set.
 * 11.Accessing the data.
 * 
 */
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		System.out.println(ts.size());
		ts.add(100);
		ts.add(75);
		ts.add(25);
		ts.add(50);
		ts.add(125);
		ts.add(175);
		ts.add(150);
		
		System.out.println(ts);
		System.out.println(ts.ceiling(30));
		System.out.println(ts.floor(75));
		System.out.println(ts.higher(25));
		System.out.println(ts.lower(125));
		System.out.println(ts.headSet(125));
		System.out.println(ts.tailSet(125));
		System.out.println(ts.subSet(50, 125));
		
		for(Object o :ts) {
			System.out.print(o+" ");
		}
		System.out.println();
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		Iterator ditr = ts.descendingIterator();
		while(ditr.hasNext()) {
			System.out.print(ditr.next()+" ");
		}

	}

}
