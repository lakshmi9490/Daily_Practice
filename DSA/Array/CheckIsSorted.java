package com.java.array.searching;

public class CheckIsSorted {

	public static void main(String[] args) {
		int arr[] = {2,4,66,8,10,12};
		System.out.println(isSorted(arr));
	}
	public static boolean isSorted(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

}
