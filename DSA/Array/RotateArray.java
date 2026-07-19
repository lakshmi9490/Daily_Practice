package com.java.array.searching;

public class RotateArray {

	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5};
		int k = 2;
		int rotate[] = rotateArray(arr,k);
		for(int a:rotate) {
			System.out.print(a+" ");
		}

	}
	public static int[] rotateArray(int arr[],int k) {
		int rotate [] = new int[arr.length];
		int count = 0;
		k = k % arr.length;
		for(int j=k;j<arr.length;j++) {
			rotate[count] = arr[j];
			count++;
		}
		for(int i=0;i<k;i++) {
			rotate[count] = arr[i];
			count++;
		}
		return rotate;
	}

}
