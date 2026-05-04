package com.java.oops;
class Test{
	//we can give static to the nested class but not to the class.
	static class Test1{
		{
			System.out.println("Inside the nested Class");
		}
	}
	//Static Members
	
	static int  a, b;//Static variable
	static {//Static Block
		System.out.println("Inside Static Block");
		
	}
	static void fun1() {//Static Method
		System.out.println("Inside Static Method");
	}
	
	//Instance Members
	
	int x,y;//Instance Variable
	{//Instance Block
		System.out.println("Inside Instances Block");
	}
	void fun2() {//Instance Method
		System.out.println("Inside Instances Method");
		
	}
	
	public Test() {
		System.out.println("Inside the Constructor");
		
	}
}
/*Here JVM load the class StaticWorking it is check for the static variable,
  static block then call the main method ,after that it came to Test but JVM 
  don't know the Test class then JVM calls the ClassLoader check for the is 
  Test.class fail is there then it gives to the JVM.
 */
public class StaticWorking {

	public static void main(String[] args) {
		Test t = new Test();
		Test.fun1();
		t.fun2();
		

	}

}
