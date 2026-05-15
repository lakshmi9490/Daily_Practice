package com.java.oops;
/*
 * 1.The Interface should have only one abstract method is called as the functional Interface.
 * 2.It is add from the J.D.K - 8.0.
 * 3.Implementing function interface with outer class which give lesser security.
 * 4.Implementing function interface with inner class which gives higher security.
 * 
 */
@FunctionalInterface
interface Example{
	void disp(int a);
//	void sub();
}
class Home implements Example{
	@Override
	public void disp(int a) {
		System.out.println("Inside the Home");
		
	}
}
//Inner Class
class Home1  {
	class BedRoom implements Example{
		@Override
		public void disp(int a) {
			System.out.println("Inside the BedRoom");
		}
	}
}
//Anonymous Inner class is without class name we are creating object.
class AnonymousInnerClass {
	 AnonymousInnerClass(){
		Example d = new Example() {
			@Override
			public void disp(int a) {
				System.out.println("Inside the Anonymous Inner class");
			}
		};
		d.disp(5);
	}
}
public class LamdaExpression {

	public static void main(String[] args) {
//		Home1 h = new Home1();
//		Home1.BedRoom b = h.new BedRoom();
//		b.disp();
		
//		@SuppressWarnings("unused")
//		AnonymousInnerClass a = new AnonymousInnerClass();
		
		Example d = (int a)->{System.out.println("Inside the lamda expression");};
		Example d1 = (a)->{System.out.println("Inside the lamda expression");};
		Example d2 = a->{System.out.println("Inside the lamda expression");};
		d.disp(5);//Lamda expression is cannot created without functional interface J.D.K 8.0
		d1.disp(57);		
		d2.disp(100);

	}

}
