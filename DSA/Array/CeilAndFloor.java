package com.java.array.searching;

import java.util.Scanner;

public class CeilAndFloor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println("ceil is : "+ceil(arr,k));
		System.out.println("floor is : "+floor(arr,k));
		sc.close();
		
	}
	public static int ceil(int arr[],int k) {
		int l=0,h=arr.length-1,mid=0;
		while(l<=h) {
			mid = (l+h)/2;
			if(arr[mid]==k) {
				return mid;
			}
			if(arr[mid]>k) {
				h = mid-1;
			}else {
				l = mid+1;
			}
		}
		if(l<arr.length) {
			return arr[l];
		}
	    return -1;
	}
	public static int floor(int arr[],int k) {
		int l=0,h=arr.length-1,mid=0;
		while(l<=h) {
			mid = (l+h)/2;
			if(arr[mid]==k) {
				return mid;
			}
			if(arr[mid]<k) {
				l = mid+1;
			}else {
				h = mid-1;
			}
		}
		if(h>=0) {
			return arr[h];
		}
		return -1;
		
	}

}
