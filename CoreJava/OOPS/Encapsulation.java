package com.java.oops;
/* Encapsulation : Every object has a important part it is secure by using 
 * private keyword by this direct access is restricted and provide the controlled
 * access in the form of setter and getters
 * 
 *  this. :  To avoid shadowing problem ,we should attach this keyword to the 
 *  instance variable.
 *  */

class Customer{
	private int cId;
	String cName;
	int cPhone;
	
	public void setData(int cId,String cName,int cPhone) {
		this.cId = cId;
		this.cName = cName;
		this.cPhone = cPhone;
		
	}
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcPhone() {
		return cPhone;
	}
	public void setcPhone(int cPhone) {
		this.cPhone = cPhone;
	}
	
    
}
public class Encapsulation {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setcId(15);
		c1.setcName("Nani");
		c1.setcPhone(9490033);
		
		System.out.println(c1.getcId()+" "+c1.getcName()+" "+c1.getcPhone());
		
		Customer c2 = new Customer();
		c2.setcId(20);
		c2.setcName("Raju");
		c2.setcPhone(9642499);
		
		System.out.println(c2.getcId()+" "+c2.getcName()+" "+c2.getcPhone());
		
		Customer c3 = new Customer();
		c3.setData(07, "Bhanu", 9381960);
		
		System.out.println(c3.getcId()+" "+c3.getcName()+" "+c3.getcPhone());
		
		

	}

}
