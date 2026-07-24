package com.java.array.searching;

public class MaxSubarraySum {

	public static void main(String[] args) {
		int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxSubarray(arr));

	}
	static int maxSubarray(int arr[]) {
		int currentMax = arr[0];
		int maxSoFar = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			currentMax = Math.max(arr[i],currentMax + arr[i]);
			maxSoFar = Math.max(maxSoFar, currentMax);
		}
		return maxSoFar;
	}

}
