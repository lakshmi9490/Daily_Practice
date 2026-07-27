package com.java.array.searching;

public class MissingNumber {

	public static void main(String[] args) {
		int ar[] = {1,2,4,5,6};
		System.out.println(missingNumber(ar));

	}
	public static int missingNumber(int ar[]) {
		int n = ar.length+1;
		int expectedSum = n * (n+1) /2;
		int actualSum = 0 ;
		for(int a : ar) {
			actualSum += a;
		}
		return expectedSum - actualSum;
	}

}
