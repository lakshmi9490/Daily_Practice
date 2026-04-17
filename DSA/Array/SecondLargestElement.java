package com.java.array.searching;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(secondLargestElement(arr));
		sc.close();

	}
	static int secondLargestElement(int arr[]) {
		int max1 = arr[0];
		int max2 = arr[1];
		if(max1<max2) {
			max1 = arr[1];
			max2 = arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2 = max1;
				max1 = arr[i];
			}
			else if(max2<arr[i] && max1 != arr[i]){
				max2 = arr[i];
			}
		}
		return max2;
	}

}
