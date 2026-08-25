package com.java.array.searching;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5};
		
		int target = 8;
		
		twoSum(arr,target);
	}
	public static void twoSum(int arr[],int target) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer> ();
		
		for(int i=0;i<arr.length;i++) {
			int required = target - arr[i];
			
			if(map.containsKey(required)) {
				System.out.println(
						"Indexes : "+map.get(required) + " "+i );
				return ;
			}
			map.put(arr[i], i);
		}
		
	}

}
