package com.java.oops;
/*
 * Rules of Method Override
 * 1.The override Method of child class must either maintain the same 
 *   access modifier as the parent class Method or provide greater access,
 *   however 
 */
class Super{
	void disp() {
		
	}
}
class Sub extends Super{
	@Override
    void disp() {
		
	}
}
/*
 * 2.The override method of child class must maintain the same return type
 * as the parent class Method.
 */
class Base{
	void disp() {
		
	}
}
class Derived extends Base{
	@Override
	void disp() {
		
	}
}
/*
 * 3.The override method of child class, the return type can be different , 
 * provided the relationship b/w the return type is "is-a" relationship. Such
 * return type b/w which "is-a" relationship exists are called as co-varient
 * return type.
 */
class Animal{
	
}
class Tiger extends Animal{
	
}
class Exp1{
	Animal disp() {
		
		Animal a = new Animal();
		return a;
				
	}
}
class Exp2 extends Exp1{
	@Override
	Tiger disp() {
		Tiger t = new Tiger();
		return t;
	}
	
}
/*
 * 4.When we are overriding the no.of parameters should to same and data type of 
 * the parameter is also same.
 */

class Pclass{
	//private int x;
	static void disp(int a) {
		System.out.println("HI");
	}
}
class Cclass extends Pclass{
	//@Override
	static void  disp(int a) {
		
//		System.out.println(x);
	}
}
/* 
 * 1.Private member cannot inherited.
 * 2.Constructor will never get inherited but executed because of super() call.
 * 3.Static method can inherited but cannot override.
 * 4.When we remove @Override it will work but parent class method is method hidden
 * in the child class
 * 
 * 
 */
public class RulesOfOverride {

	public static void main(String[] args) {
		
	}

}
