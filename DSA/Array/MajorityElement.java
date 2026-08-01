package com.java.array.searching;

import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[] = {3, 3, 4, 2, 3, 3, 5};
		System.out.println(majorityElement(arr));
		
	}
	public static int majorityElement(int arr[]) {
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer> ();
		int maxElement = -1;
		int maxFreq = 0;
		for(int i = 0;i < arr.length;i++) {
			map.put(arr[i],map.getOrDefault(arr[i],0)+1 );
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			
			if(entry.getValue()>maxFreq) {
				maxFreq = entry.getValue();
				maxElement = entry.getKey();
			}
		}
		return maxElement;
	}

}
