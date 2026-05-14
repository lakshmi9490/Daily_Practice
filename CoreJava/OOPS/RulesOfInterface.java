package com.java.oops;
/*
 * 1.An interface is like a contract which when implemented helps to achieve Standardization.
 * 
 * 2.Interface promote polymorphism ,An interface type reference can point  to implementing
 *  class objects. this achieves loose coupling, code reduction and code flexibility.
 * 
 * 3.Methods within the interface automatically public abstract.
 * 
 * 4.Specialized Methods cannot be accessed directly using interface type reference.
 * 
 * 5.If a class partially implements interface, it must declare itself as abstract.
 * 
 * 6.A class can implement multiple interfaces because diamond shape problem does not exist
 * as interfaces will not have parents.
 * 
 * 7.An interface cannot implement another interface,because interface cannot provide
 * methods with bodies inside it.
 * 
 * 8.An interface can extends another interface.Not only this it can inherit from multiple
 * interfaces because diamond shape problem does not exits.
 * 
 * 9.A class can both extends another class as well implements an interface. However order
 * should be extends first and implement later.
 * 
 * 10.An interface contain constant variables and method signature.A variable within an 
 * interface is automatically public static final.
 * 
 * 11.An empty interface in java is referred to as marker interface (or) jagged interface .
 * It is used to provide special properties to the object of the class.
 * 
 * 12.An object of an interface cannot be created because an interface is a collection of 
 * abstract methods.However reference can be created so that loose coupling ,polymorphism
 * and its advantages can be achieved.
 * 
 */
interface Rules1{
	void add();
	void sub();
}
interface Rules2 {
	int COUNT = 1;
}
interface Rules3{
	
}
interface Rules4 extends Rules1,Rules2,Rules3{  
	
}
class Rules5{
	
}
class Rules6{
	
}
class Test5 implements Rules2{
	
     void disp() {
    	 	System.out.println(COUNT);
     }
}

abstract class Regulations extends Rules5 implements Rules1,Rules2,Rules3 {
	@Override
	public void add() {
		System.out.println("This is add Methods");
	}
}
public class RulesOfInterface {

	public static void main(String[] args) {
//		Rules r = new Regulations();
		Test5 t = new Test5();
		t.disp();

	}

}
