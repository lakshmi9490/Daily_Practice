package com.java.oops;
/*
 * 1.Final variable is inherited but overwrite it.
 * 2.Final method can be inherited but cannot override.
 * 3.Final can give to the class that class cannot be extend.
 */
 class Demo{
	 final int a = 10;
	 final void disp1() {
		 System.out.println("Final Method");
	 }
}
final class Demo1 extends Demo{
	void disp() {
//		a = 26;
		System.out.println(a);
	}
//	void disp1() {
//		
//	}
}
public class FinalWorking {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.disp();
		d.disp1();
		
	}

}
