package com.java.array.searching;

import java.util.Scanner;

public class TargetSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		int ar[] = new int[n];
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("what is the target sum");
		int targetSum = sc.nextInt();
		
		targetSum(ar,targetSum);
		
		sc.close();
		
	}
	public static void targetSum(int arr[],int targetSum) {
		int l = 0;
		int r = arr.length-1;
		boolean found = false;
		while(l<r) {
			if(arr[l]+arr[r] == targetSum) {
				System.out.println(arr[l]+ " "+arr[r]);
				l++;
				r--;
				found = true;
			}
			else if(arr[l]+arr[r]<targetSum) {
				l++;
			}
			else {
				r--;
			}
		
		}
		if(!found) {
			System.out.println("No Elements Found.");
		}
		
	}

}
