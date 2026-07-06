package com.java.matrices;

import java.util.Scanner;

public class TargetMatrix {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int ar[][] = {{1,4,7,11,15},
				{2,5,8,12,19},
				{3,6,9,16,22},
				{10,13,14,17,24}};
		
		int target = new Scanner(System.in).nextInt();
		System.out.println(findTarget(ar, target));

	}
	public static boolean findTarget(int ar[][],int target) {
		int i=0,j=ar[i].length-1;
		
		while(i<ar.length && j>=0) {
			if(ar[i][j] == target) {
				return true;
			}
			else if(ar[i][j]>target) {
				j--;
			}
			else {
				i++;
			}
		}
		return false;
		
	}

}
