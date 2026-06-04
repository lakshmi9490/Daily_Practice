package com.java.collections;
/*
 * 1.How to use.
 * 2.Hetergenous data can store.
 * 3.Duplicates can store.
 * 4.Null value cannot store.
 * 5.Preserve the order of insertion.
 * 6.Internal DataStructure - Double ended Queue.
 * -> Initial Capacity - 16;
 * -> new capacity = old capacity * 2;
 * 7.Constructor -3 
 * 8.Hierarchy
 * 9.Methods
 * 10.Accessing the data.
 * 
 * 
 */
import java.util.ArrayDeque;
import java.util.ArrayList;

public class ArrayDequeClass {

	public static void main(String[] args) {
		ArrayList al = new ArrayList ();
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(50.4);
		ad.add("Lakshmi");
		ad.addAll(al);
		ad.addFirst(15);
		ad.addLast(12);
		//ad.add(null);
//		System.out.println(ad);
		
		ArrayDeque ad1 = new ArrayDeque ();
		ad1.push(20);
		ad1.push(30);
		ad1.push(40);
		ad1.push(50);
		System.out.println(ad1);
//		int n = ad1.size();
//		System.out.println(n);
		for(int i=0;i<ad1.size();i++) {
			System.out.print(ad1.pop()+" ");
		}

	}

}
