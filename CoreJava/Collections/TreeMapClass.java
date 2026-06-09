package com.java.collections;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(18,"Virat");
		tm.put(45, "Rohit");
		tm.put(7, "Dhoni");
		
		System.out.println(tm);
		
		for(Object s:tm.entrySet()) {
			System.out.println(s);
		}

	}

}
