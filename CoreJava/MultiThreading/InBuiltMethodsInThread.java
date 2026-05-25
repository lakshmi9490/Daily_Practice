package com.java.multithreading;

public class InBuiltMethodInThread  {

	public static void main(String[] args) {
		Thread t  = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getThreadGroup());
		
		Alpha a =new Alpha();
		
		Beta b = new Beta();
		System.out.println(a.isAlive());
		a.start();
		try {
			a.join();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		b.start();

	}

}
class Alpha extends Thread{
	@Override
	public void run() {
		try {
			Thread t = Thread.currentThread();
//			t.setName("Mawa");
//			t.setPriority(7);
//			System.out.println(t);
			System.out.println(t.getName()+" "+"is executing stmt1");
			Thread.sleep(2000);
			System.out.println(t.getName()+" "+"is executing stmt2");
			Thread.sleep(2000);
			System.out.println(t.getName()+" "+"is executing stmt3");
			Thread.sleep(2000);
			System.out.println(t.getName()+" "+"is executing stmt4");
			Thread.sleep(2000);
			System.out.println(t.getName()+" "+"is executing stmt5");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
class Beta extends Thread{
	@Override
	public void run() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+" "+"is executing stmt1");
			Thread.sleep(2000);
			System.out.println(t.getName()+" "+"is executing stmt2");
			Thread.sleep(2000);
			System.out.println(t.getName()+" "+"is executing stmt3");
			Thread.sleep(2000);
			System.out.println(t.getName()+" "+"is executing stmt4");
			Thread.sleep(2000);
			System.out.println(t.getName()+" "+"is executing stmt5");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
