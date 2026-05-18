package com.java.exception;
/*
 * Checked Exception = Compile time Exception ex : Thread.sleep() ,
 * UnCheckec EXception = Run-time Exception 
 */
public class CheckedException {

	public static void main(String[] args) {
		for(int i=65;i<=69;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
