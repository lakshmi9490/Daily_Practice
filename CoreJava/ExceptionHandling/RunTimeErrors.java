package com.java.exception;
/*
 * Runtime Error : A runtime error occurs during execution of program,due to faulty coding
 * errors (or) lack of system resources. Then errors can cause the program to terminate 
 * unexpectedly.
 * Ex :- OutOfMemoryError ,StackOverFlowError
 */
public class RunTimeErrors {

	public static void main(String[] args) {
//		Demo d = new Demo();
//		d.fun();
		
		Test t = new Test();
		t.fun();

	}

}
class Test{
	void fun() {
		
		@SuppressWarnings("unused")
		int[] arr = new int[Integer.MAX_VALUE];
	}
}
class Demo{
	void fun() {
		fun();
	}
}
