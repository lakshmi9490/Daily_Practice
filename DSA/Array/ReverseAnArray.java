package com.java.array.searching;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int arr[] = {23,14,68,53,91,74};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		reverse(arr);
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void reverse(int arr[]) {
		int i = 0 ,j = arr.length-1;
		while(i<j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
	}

}
