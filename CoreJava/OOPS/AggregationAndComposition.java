package com.java.oops;

class Bike{
	private String brand;
	private float mileage;
	
	public Bike(String brand,float mileage) {
		this.brand = brand;
		this.mileage = mileage;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public float getMileage() {
		return mileage;
	}
}

class Book{
	private String name;
	private String author;
	
	public Book(String name,String author) {
		this.name = name;
		this.author = author;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
}

class Brain{
	private int weight;
	private String colour;
	
	
	public Brain(int weight,String colour) {
		this.weight = weight;
		this.colour = colour;
		
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getColour() {
		return colour;
	}
	
}

class Heart{
	private int weight;
	private int bpm;
	
	public Heart(int weight,int bpm) {
		this.weight = weight;
		this.bpm = bpm;
		
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getBpm() {
		return bpm;
	}
	
}

class Student1{
	
	Heart h = new Heart(250,70);
	Brain b = new Brain(750,"Grey");
	
	void bike(Bike bi) {
		System.out.println(bi.getBrand());
		System.out.println(bi.getMileage());
	}
	
	void book(Book b ) {
		System.out.println(b.getName());
		System.out.println(b.getAuthor());
	}
}
public class AggregationAndComposition {

	public static void main(String[] args) {
		//Student is there
		Student1 s = new Student1();
		Bike bi = new Bike("Activa",35.8f);
		Book b = new Book("Java","James Gosling");
		
		
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getColour());
		System.out.println("-----------------------------");
		System.out.println(s.h.getWeight());
		System.out.println(s.h.getBpm());
		System.out.println("-----------------------------");
		s.bike(bi);
		System.out.println("-----------------------------");
		s.book(b);
		
		//Student is no more
		s = null;
		//System.out.println(s.h.getBpm());
		//System.out.println(s.h.getWeight());
	    System.out.println(bi.getBrand());
	    System.out.println(bi.getMileage());
		
	}

}
