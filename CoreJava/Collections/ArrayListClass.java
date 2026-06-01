package com.java.collections;
/*
 * 1.How to use?
 * 2.Heterogenous data can store.
 * 3.Duplicate can store.
 * 4.Null can store.
 * 5.Preserve order of insertion.
 * 6.Internal DataStructure - Dynamic Array.
 * newCapacity = ((oldCapacity*3)/2+1;
 * 7.Constructor - 3 ->ArrayList(),ArrayList(int),ArrayList(Collection)
 * 8.Hierarchy 
 * 9.Methods of ArrayList.
 * 10.Accessing the Data.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList(8);
		al1.add(10);
		al1.add(20.0);
		al1.add(22.5f);
		al1.add(true);
		al1.add('C');
		al1.add("Nani");
		al1.add(null);
		al1.add(null);
		al1.add(null);
//		System.out.println(al1);
		
		ArrayList al2 = new  ArrayList ();
		al2.add(10);
		al2.add(30);
		al2.add(50);
		al2.add(90);
		
//		System.out.println(al2);
//		al2.add(1,2000);
//		System.out.println(al2);
	
		ArrayList al3 = new ArrayList();
		al3.add(20);
		al3.add(30);
		al3.add(40);
		al3.add(50);
		al3.add(60);
		al3.add(70);
		
//		System.out.println(al2);
//		al2.addAll(al3);
//		System.out.println(al2);
//		al2.addAll(2,al3);
//		System.out.println(al2);
		
//		al2.removeAll(al3);
//		al2.retainAll(al3);
		
//		al3.remove(4);
//		System.out.println(al3);
		
//		System.out.println(al2.size());
		
//		System.out.println(al2);
//		al2.set(2, al3);
//		System.out.println(al2);
//		
//		System.out.println(al2.contains(90));
        
//		System.out.println(al2.isEmpty());
		for(int i=0;i<al2.size();i++) {
			System.out.print(al2.get(i)+" ");
		}
		System.out.println();
		for(Object i:al2) {
			System.out.print(i+" ");
		}
		System.out.println();
		Iterator itr = al2.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		ListIterator litr = al2.listIterator(al2.size());
		while(litr.hasPrevious()) {
			System.out.print(litr.previous()+" ");
		}
	}

}
