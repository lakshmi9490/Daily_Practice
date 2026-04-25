package com.java.Array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int ar [][][]  = new int [2][][];
		ar [0] = new int[2][];
		ar [1] = new int[3][];
		ar[0][0] = new int[3];
		ar[0][1] = new int[4];
		ar[1][0] = new int[2];
		ar[1][1] = new int[3];
		ar[1][2] = new int[5];
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				for(int k=0;k<ar[i][j].length;k++) {
					System.out.println("Enter the School "+i+" Class "+j+" Student age "+k);
					ar[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println();
		
		for(int i=0;i<ar.length;i++) {
			System.out.println("School " + i);
			for(int j=0;j<ar[i].length;j++) {
				for(int k=0;k<ar[i][j].length;k++) {
					System.out.print(ar[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		sc.close();

	}

}
