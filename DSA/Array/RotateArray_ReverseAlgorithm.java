package com.java.array.searching;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray_ReverseAlgorithm {
	
	public static void main(String [] args) {
		int arr[] = {1,2,3,4,5};
		Scanner sc = new Scanner (System.in);
		int k = sc.nextInt();
		
//		leftRotate(arr,k);
//		System.out.println(Arrays.toString(arr));
		
		rightRotate(arr,k);
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}
	public static void leftRotate(int arr[],int k) {
		int n = arr.length;
		k = k % n ;
		
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		reverse(arr,0,n-1);
	}
	public static void rightRotate(int arr[] ,int k) {
		int n = arr.length;
		k = k % n ;
		
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
	}
	public static void reverse(int arr[],int start,int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;end--;
		}
	}
}
