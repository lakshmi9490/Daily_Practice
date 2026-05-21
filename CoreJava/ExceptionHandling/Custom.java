package com.java.exception;

import java.util.Scanner;
@SuppressWarnings("serial")
class UnderAgeException extends Exception{
	@Override
	public String getMessage() {
		return "You are too young.Have patiences";
	}
}
@SuppressWarnings("serial")
class OverAgeException extends Exception{
	@Override
	public String getMessage() {
		return "You are too old.Cool down";
	}
}
class Applicant{
	int age;
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age : ");
	    age = sc.nextInt();
	    
	}
	void verify() throws Exception {
		if(age>=18 && age<=65) {
			System.out.println("Collect the License");
		}
		else if(age<=18){
			UnderAgeException uae = new UnderAgeException();
			throw uae;
		}
		else {
			OverAgeException oae = new OverAgeException();
			throw oae;
		}
	}
}

class RTO{
	void acceptApplicant() {
		Applicant a = new Applicant();
		try {
			a.acceptInput();
			a.verify();
		}catch(Exception e) {
			try {
				
				System.out.println(e.getMessage()+", Enter the correct Age");
				a.acceptInput();
				a.verify();
			}catch(Exception f) {
				System.out.println("Apply again in 15 days");
			}
		}
	}
	
}
public class Custom {

	public static void main(String[] args) {
		RTO r = new RTO();
		r.acceptApplicant();
		

	}

}
