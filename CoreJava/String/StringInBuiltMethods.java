package com.java.String;

public class StringInBuiltMethods {

	public static void main(String[] args) {
		
		String s = "    RajaRamMohanRoy";
//		System.out.println(s.length());
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
//		System.out.println(s.charAt(3));
//		System.out.println(s.codePointAt(1));
//		System.out.println(s.indexOf('A'));
//		System.out.println(s.concat("Raju"));
//		System.out.println(s.contains("Ram"));
//		System.out.println(s.indexOf('j'));
//		System.out.println(s.lastIndexOf('R'));
//		System.out.println(s.isEmpty());
//		System.out.println(s.isBlank());
		System.out.println(s.startsWith("Raja"));
		System.out.println(s.endsWith("Roy"));
//		char []arr = s.toCharArray();
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println(s.substring(4,7));
//		String arr[] = s.split(",");
		System.out.println(s.trim());
		

	}

}
