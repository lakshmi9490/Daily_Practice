package com.java.String;

public class StringBufferAndBuilder {

	public static void main(String[] args) {
//		String s = "nani";
//		StringBuffer sb = new StringBuffer(s);
//		sb.reverse();
//		System.out.println(sb);
//		StringBuilder st = new StringBuilder(sb);
//		st.reverse();
//		System.out.println(st);
		
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println(sb.capacity());
		sb.append("India");
		System.out.println(sb.capacity());
		sb.append(" is Beautiful");
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.delete(6, 8);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		

	}

}
