package com.java.array.searching;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int ar1[] = {1,6,9};
		int ar2[] = {3,12,15};
		
		System.out.println(Arrays.toString(mergeSortedArrays(ar1, ar2)));

	}
	public static int [] mergeSortedArrays(int ar1[],int ar2[]) {
		int i=0,j =0,k=0;
		int result[] = new int[ar1.length+ar2.length];
		
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i]<=ar2[j]) {
				result[k++] = ar1[i++];
			}
			else {
				result[k++] = ar2[j++];
			}
		}
		while(i<ar1.length) result[k++] = ar1[i++];
		while(j<ar2.length) result[k++] = ar2[j++];
		
		return result;
	}

}
