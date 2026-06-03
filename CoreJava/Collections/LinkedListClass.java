package com.java.collections;
/*
 * 1.How to use.
 * 2.Heterogenous data can store.
 * 3.Duplicates can store.
 * 4.Null can store.
 * 5.Preserve order of insertion.
 * 6.Internal DataStructure - Doubly LinkedList
 * -> DataStore in the 3-unit allocated with node .
 * initial capacity is 0.
 * 7.Constructors -2,1.LinkedList(),2.LinkedList(Collection)
 * 8.Hierarchy 
 * 9.Methods in LinkedList more than the ArrayList.
 * 10.Accessing the data.
 */
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
	
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(10);
		ll.add(null);
		ll.add("nani");
		ll.add(30);
		ll.add(40);
		
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll);
		
		System.out.println(ll.poll());
		System.out.println(ll);
		
		ll.offer(70);
		ll.addFirst(15);
	    ll.addLast(12);
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.offerFirst(8);
		ll.offerLast(2);
		System.out.println(ll);

	}

}
