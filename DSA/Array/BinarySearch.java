package com.java.array.searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(binarySearch(arr,k));
		sc.close();

	}
	public static int binarySearch(int arr[],int k) {
		int l=0,h=arr.length-1;
		int mid = 0;
		while(l<=h) {
			mid = (l+h)/2;
			if(arr[mid]==k) {
				return mid;
			}else if(arr[mid]>k) {
				l = mid+1;
			}else {
				h = mid-1;
			}
		}
		return -1;
	}

}
