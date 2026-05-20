package com.java.exception;

import java.util.Scanner;


@SuppressWarnings("serial")
class IncorrectPinException extends Exception{
	
}
class Atm{
	int pin = 1512;
	int p;
	@SuppressWarnings("resource")
	void acceptInput() {
	   Scanner sc = new Scanner (System.in);
	   System.out.println("Enter the pin");
	   p = sc.nextInt();
	   
	}
	void verify() throws Exception{
		if(pin == p) {
			System.out.println("Collect the Cash.");
		}
		else {
			IncorrectPinException ipe = new IncorrectPinException();
			System.out.println("Pin is incorrect,Please re-enter the pin");
			throw ipe;
			
			
		}
	}
}
class Bank{
	
	void start(){
		Atm a = new Atm();
		try {
			a.acceptInput();
			a.verify();
		}
		catch(Exception e){
			try {
				a.acceptInput();
				a.verify();
			}
			catch(Exception f){
				try {
					a.acceptInput();
					a.verify();
				}
				catch(Exception g) {
					System.out.println("Your card is block !!!, Please contact bank. ");
				}
			}
		}
	}
}
public class CustomException {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.start();

	}

}
