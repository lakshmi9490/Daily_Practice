package com.java.Array;

import java.util.Scanner;

public class RegularArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of Schools : ");
		int s = sc.nextInt();
		System.out.println("Enter the number of Classes in each Schools :");
		int c = sc.nextInt();
		System.out.println("Enter eh number of students in each Class");
		int st = sc.nextInt(); 
		
		int ar [][][] = new int [s][c][st];
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				for(int k=0;k<ar[i][j].length;k++) {
					System.out.println("Enter the student in School "+i+" class "+j+" Student "+k);
					ar[i][j][k] = sc.nextInt();
				}
				
			}
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				for(int k=0;k<ar[i][j].length;k++) {
					System.out.print(ar[i][j][k] +" ");
					
				}
				System.out.println();
			}
			System.out.println();
		}
		sc.close();

	}

}
