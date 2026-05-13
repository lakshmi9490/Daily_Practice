package com.java.recursion;

import java.util.Scanner;

public class SumOfEle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sumOfEle(arr, 0));
		sc.close();

	}
	static int sumOfEle(int arr[],int i) {
		if(i == arr.length) {
			return 0;
		}
		return sumOfEle(arr,i+1)+arr[i];
	}

}
