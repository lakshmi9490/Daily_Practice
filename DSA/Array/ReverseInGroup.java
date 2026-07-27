package com.java.array.searching;

import java.util.Arrays;

public class ReverseInGroup {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		int k = 3;
		reverseInGroup(arr, k);
		System.out.println(Arrays.toString(arr));

	}
	public static void reverseInGroup(int arr[],int k) {
		for(int i=0;i<arr.length;i=i+k) {
			int left = i;
			int right = Math.min(i + k-1, arr.length-1);
			while(left<=right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}

}
