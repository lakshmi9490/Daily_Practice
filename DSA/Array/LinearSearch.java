package com.java.array.searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		System.out.println(linearSearch(arr, k));
		sc.close();

	}
	public static int linearSearch(int arr[],int k) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				return i;
			}
		}
		return -1;
	}

}
