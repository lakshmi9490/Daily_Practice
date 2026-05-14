package com.java.oops;

interface Students{
	default void personalLife() {
		redundantCode();
	}
	default void professionalLife() {
		redundantCode();
	}
	/*
	 * Private method is used inside the interface to support code redundancy ,It is add
	 * from the jdk-9.0
	 * private method is cannot inherited
	 * private method is a instance method which cannot used in the static method.
	 */
	private void redundantCode() {
		System.out.println("Student will wake up with mobile");
		System.out.println("Student will do activity with mobile");
		System.out.println("Student will have breakfast with mobile");
		System.out.println("Student will come to class with mobile");
		System.out.println("Student will listen the class withe mobile");
		System.out.println("Student will sleep with the mobile");
	}
	/*
	 * private static method is used for the to use in the static methods it's is add from
	 * the j.d.k 9.0
	 */
	private static void privateStatic() {
		System.out.println("Hello");
	}
	static void dips() {
		privateStatic();
	}
}
class Sdt implements Students{
	
}
interface SeaAnimals{
	void swim();
	void eat();
	/*
	 * Default method is add from jdk-8.0 it is support  to previous version of java (or)
	 * backward compatibility they add default method.
	 */
	default void communicate() {
		System.out.println("SeaAnimals Communicate");
	}
	/*
	 * 1.static method is add from jdk-8.0 it is used directly calling with the interface name
	 * 2.static method cannot inherit and override
	 */
	static void staticMethod() {
		System.out.println("Static Method");
	}
}
class Shark implements SeaAnimals{
	@Override
	public void swim() {
		System.out.println("Shark Swim");
	}
	@Override
	public void eat() {
		System.out.println("Shark eats Human being");
	}
}
class Dolphin implements SeaAnimals{
	@Override
	public void swim() {
		System.out.println("Dolphin Swim");
	}
	@Override
	public void eat() {
		System.out.println("Dolphin eats small fishes");
	}
}
class Whale implements SeaAnimals{
	@Override
	public void swim() {
		System.out.println("Whale Swim");
	}
	@Override
	public void eat() {
		System.out.println("Whale eats big fishes");
	}
}

class SeaKindom{
	void permit(SeaAnimals s) {
		s.swim();
		s.eat();
	}
}
public class FeaturesOfInterface {

	public static void main(String[] args) {
		Shark s = new Shark();
		Dolphin d = new Dolphin();
		Whale w = new Whale();
		
		SeaKindom sk = new SeaKindom();
		sk.permit(s);
		sk.permit(d);
		sk.permit(w);
		
		SeaAnimals.staticMethod();
		
		Sdt st = new Sdt();
		st.personalLife();
		st.professionalLife();

	}

}
