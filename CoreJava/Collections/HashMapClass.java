package com.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(7, "Dhoni");
		hm.put(18, "Virat");
		hm.put(45,"Rohit");
		System.out.println(hm.get(46));
		hm.remove(18);
		System.out.println(hm.containsKey(7));
		System.out.println(hm.containsValue("Dhoni"));
		System.out.println(hm);
//		
//		Set s = hm.entrySet();
//		Iterator itr = s.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next()+" ");
//		}
//		System.out.println();
//		
//		Set k= hm.keySet();
//		Iterator key = k.iterator();
//		while(key.hasNext()) {
//			System.out.println(key.next());
//		}
//		System.out.println();
//		
//		Collection c = hm.values();
//		Iterator v = c.iterator();
//		while(v.hasNext()) {
//			System.out.println(v.next());
//		}
		
		

	}

}
