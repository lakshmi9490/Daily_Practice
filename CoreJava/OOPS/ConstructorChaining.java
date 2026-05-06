package com.java.oops;

/* Super is used to call the parent class constructor .
 * If Super is not provided by programmer JavaCompiler will provide the default super.
 * Super is always in the first line the constructor.
 * Super() and this() cannot write the one constructor.
 * If Super() is there we cannot write the this().
 */

class Test1{
	int x,y;
	Test1(){
		x = 100;
		y = 200;
	}
	Test1(int x,int y){
		this();
		this.x = x;
		this.y = y;
	}
}
class Test2 extends Test1{
	int a,b;
	Test2(){
		a = 300;
		b = 400;
	}
	Test2(int a,int b){
		super(a,b);
		this.a = a;
		this.b = b;
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		Test2 t = new Test2(9,99);
		
		System.out.println(t.x);
		System.out.println(t.y);
		System.out.println(t.a);
		System.out.println(t.b);

	}

}
