package com.java.oops;

import java.util.Scanner;

abstract class Shape{
	float area;
	Scanner sc = new Scanner (System.in);
	abstract void acceptInput();
	abstract void calcutateArea();
	void dispArea() {
		System.out.println("Area is :"+area);
	}
}
class Square extends Shape{
	private float side;
	@Override
	void acceptInput() {
		System.out.println("Enter the side :");
		side = sc.nextFloat();
	}
	@Override
	void calcutateArea() {
		area = side * side;
	}
}
class Rectangle extends Shape{
	private float length;
	private float breadth;
	@Override
	void acceptInput() {
		System.out.println("Enter the length :");
		length = sc.nextFloat();
		System.out.println("Enter the breadth :");
		breadth = sc.nextFloat();
	}
	@Override
	void calcutateArea() {
		area = length * breadth;
	}
}
class Circle extends Shape{
	private float radius;
	@Override
	void acceptInput() {
		System.out.println("Enter the radius :");
		radius = sc.nextFloat();
	}
	@Override
	void calcutateArea() {
		final float PI = 3.142f;
		area = PI * radius * radius ;
	}
}
class Geometry{
	void permit(Shape s) {
		s.acceptInput();
		s.calcutateArea();
		s.dispArea();
	}
}
public class FourPillars {

	public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		Geometry g = new Geometry ();
		
		g.permit(s);
		g.permit(r);
		g.permit(c);
	}

}
