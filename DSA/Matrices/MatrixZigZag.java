package com.java.matrices;

import java.util.Scanner;
//{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}
public class MatrixZigZag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size of the array ");
		int r = sc.nextInt();
		System.out.println("Enter the column ssize of the array ");
		int c = sc.nextInt();
		int arr[][] = new int [r][c];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			if(i % 2 == 0 ) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}else {
				for(int j=arr[i].length-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		sc.close();

	}

}
