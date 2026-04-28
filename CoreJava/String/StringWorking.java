package com.java.String;
/*String are objects in java.They are two types of String
  1.Mutable String
  2.Immutable String
  
  The String which is created without new the object is created in the
  String constant pool here no duplicates or allowed.
  
  The String which is created with new the object is created in the heap segment.
*/
public class StringWorking {

	public static void main(String[] args) {
		
		//Difference way to create Immutable String
		/*String s1 = "Java";
		String s2 = new String("Nani");
		char [] c = {'j','a','v','a'};
		String s = new String(c);
		System.out.println(c);*/
		
		/*String s1 = "Java";
		String s2 = "Java";
		
		if(s1==s2) {
			System.out.println("s1,s2 References are equal");
		}else {
			System.out.println("s1,s2 References are unequal");
		}
	
		if(s1.equals(s2)) {
			System.out.println("s1,s2 Values are equal");
		}else {
			System.out.println("s1,s2 Values are unequal");
		}*/
		
		/*String s1 = "JAVA";
		String s2 = "Java";
		
		if(s1==s2) {
			System.out.println("s1,s2 References are equal");
		}else {
			System.out.println("s1,s2 References are unequal");
		}
	
		if(s1.equals(s2)) {
			System.out.println("s1,s2 Values are equal");
		}else {
			System.out.println("s1,s2 Values are unequal");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1,s2 Values are equal");
		}else {
			System.out.println("s1,s2 Values are unequal");
		}*/
		
		/*String s1 = "Nani";
		String s2 = new String("Nani"); 
		
		if(s1==s2) {
			System.out.println("s1,s2 References are equal");
		}else {
			System.out.println("s1,s2 References are unequal");
		}
	
		if(s1.equals(s2)) {
			System.out.println("s1,s2 Values are equal");
		}else {
			System.out.println("s1,s2 Values are unequal");
		}*/
		
		/*String s1 = "Nani";
		String s2 = new String ("nani");
		
		if(s1==s2) {
			System.out.println("s1,s2 References are equal");
		}else {
			System.out.println("s1,s2 References are unequal");
		}
	
		if(s1.equals(s2)) {
			System.out.println("s1,s2 Values are equal");
		}else {
			System.out.println("s1,s2 Values are unequal");
		}*/
		
		/*String s1 = new String("Java");
		String s2 = new String("Java");
		
		if(s1==s2) {
			System.out.println("s1,s2 References are equal");
		}else {
			System.out.println("s1,s2 References are unequal");
		}
	
		if(s1.equals(s2)) {
			System.out.println("s1,s2 Values are equal");
		}else {
			System.out.println("s1,s2 Values are unequal");
		}*/
		
		String s1 = new String("Java");
		String s2 = new String("java");
		
		if(s1==s2) {
			System.out.println("s1,s2 References are equal");
		}else {
			System.out.println("s1,s2 References are unequal");
		}
	
		if(s1.equals(s2)) {
			System.out.println("s1,s2 Values are equal");
		}else {
			System.out.println("s1,s2 Values are unequal");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1,s2 Values are equal");
		}else {
			System.out.println("s1,s2 Values are unequal");
		}
		

	}

}
