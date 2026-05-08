package com.java.oops;
/*
 *1. polymorphism  is a greek work poly means 1 morphism means "Many"
 *   1 in many forms.
 *2. Using parent reference to child object is called as the loose-coupling.
 *3. By this we can invoke the inherited method and override method but we
 *   cannot use the Specialized method.
 *4. To access the specialized method we have do down-casting parent class
 *	 reference to the child class reference.
 */
class Plane1{
	void takeOff() {
		System.out.println("Plane takeOff");
	}
	void fly() {
		System.out.println("Plane flying");
	}
	void land() {
		System.out.println("Plane landing");
	}
}
class CargoPlane1 extends Plane1{
	@Override
	void takeOff() {
		System.out.println("CargoPlane need medium run-way to take-off");
	}
	@Override
	void fly() {
		System.out.println("CargoPlane fly at lower heights");
	}
	@Override
	void land() {
		System.out.println("CargoPlane need medium run-way to land");
	}
}
class PassengerPlane1 extends Plane1{
	@Override
	void takeOff() {
		System.out.println("PassengerPlane need long run-way to take-off");
	}
	@Override
	void fly() {
		System.out.println("PassengerPlane fly at medium heights");
	}
	@Override
	void land() {
		System.out.println("PassengerPlane need long run-way to land");
	}
	void look() {
		System.out.println("PassengerPlane looks very good.");
	}
}
class FighterPlane1 extends Plane1{
	@Override
	void takeOff() {
		System.out.println("FighterPlane need short run-way to take-off");
	}
	@Override
	void fly() {
		System.out.println("FighterPlane fly at higher heights");
	}
	@Override
	void land() {
		System.out.println("FighterPlane need short run-way to land");
	}
}
class AirPort{
	void permit(Plane1 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class Polymorphism {
	

	public static void main(String[] args) {
//		Plane1 ref;
//		ref = new CargoPlane1();//upcasting
		 CargoPlane1 cp = new CargoPlane1();
		PassengerPlane1 pp= new PassengerPlane1();
		FighterPlane1 fp =  new FighterPlane1();
		
		AirPort a = new AirPort();
		a.permit(cp);
		System.out.println("--------------------------------");
		a.permit(pp);
		System.out.println("--------------------------------");
		a.permit(fp);
		
//		ref.takeOff();
//		ref.fly();
//		ref.land();
//		System.out.println("--------------------------------");
//		ref = pp;
//		ref.takeOff();
//		ref.fly();
//		ref.land();
//		((PassengerPlane1)(ref)).look();//downcasting
//		System.out.println("--------------------------------");
//		ref = fp;
//		ref.takeOff();
//		ref.fly();
//		ref.land();
		
		
		

	}
/*
 * Advantages of Polymorphism
 * 1.Code Readability.
 * 2.Flexibility or maintainability.
 * 3.Reduction in complexity.
 */
} 
