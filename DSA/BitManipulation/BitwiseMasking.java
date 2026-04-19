package com.java.bitmanipulation;

public class BitwiseMasking {

	public static void main(String[] args) {
		int n = 30;
		int i = 0;
		System.out.println(checkMask(n, i));

	}
	public static int onMask(int n,int i) {
		int mask = 1 << i;
		
		return n | mask;
	}
	public static int offMask(int n,int i) {
		int mask = ~(1<<i);
		
		return n & mask;
	}
	public static int toggleMask(int n,int i) {
		int mask = 1 << i;
		
		return n ^ mask;
	}
	public static String checkMask(int n,int i) {
		int mask = 1 << i;
		
		if((n & mask) == 0) {
			return "Off";
		}
		else {
			return "On";
		}
	}

}
