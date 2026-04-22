package com.java.bitmanipulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class LonelyInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		//System.out.println(lonelyInteger1(arr));
		//System.out.println(lonelyInteger2(arr));
		System.out.println(lonelyInteger3(arr));
		sc.close();
		
	}
	public static int lonelyInteger1(int arr[]) {
		Arrays.sort(arr);
		for(int i=0;i<=arr.length-2;i +=2) {
			if(arr[i]!=arr[i+1]) {
				return arr[i];
			}
			
		}
		return arr[arr.length-1];
	}
	
	public static int lonelyInteger2(int arr[]) {
		HashSet<Integer> s = new HashSet<Integer> ();
		for(int i:arr) {
			if(s.contains(i)) {
				s.remove(i);
			}else {
				s.add(i);
			}
		}
		for(int i:s) {
			return i;
		}
		return -1;
	}
	
	public static int lonelyInteger3(int arr[]) {
		int result = 0;
		for(int i:arr) {
			result ^= i;
		}
		return result;
	}

}
