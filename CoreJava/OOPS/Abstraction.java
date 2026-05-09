package com.java.oops;
/*
 * Abstraction : Abstraction is hiding implementation details and exposing 
 * only necessary information to the user.
 * 1.Abstraction class cannot be instantiated and can only be used as a base
 *   class for other classes.
 */
abstract class Bird{
	abstract void eat();
	abstract void fly();
}
abstract class Eagle extends Bird{
	@Override
	void fly() {
		System.out.println("Eagle files in the higher heights.");
	}
}
class SerpentEagle extends Eagle{
	@Override
	void eat() {
		System.out.println("SerpentEagle eats snakes.");
	}
}
class GoldenEagle extends Eagle{
	@Override
	void eat() {
		System.out.println("GoldenEagle eats fishes.");
	}
}
class BirdKingdom{
	void permit(Eagle b) {
		b.eat();
		b.fly();
	}
}
public class Abstraction {

	public static void main(String[] args) {
		SerpentEagle s = new SerpentEagle();
		GoldenEagle g = new GoldenEagle();
		
		BirdKingdom bk = new BirdKingdom();
		bk.permit(s);
		bk.permit(g);

	}

}
