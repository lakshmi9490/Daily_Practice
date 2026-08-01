package com.java.array.searching;

public class RepeatingElement {

	public static void main(String[] args) {
		int arr[] = {3, 3, 4, 2, 3, 3, 5};
		System.out.println(repeatingElement(arr));
	}
	public static int repeatingElement(int arr[]) {
		int count = 0;
		int candidate = -1;
		for(int num : arr) {
			if(count == 0) {
				candidate = num;
				count = 1;
			}else if(num == candidate) {
				count++;
			}else {
				count--;
			}
		}
		return candidate;
	}

}
