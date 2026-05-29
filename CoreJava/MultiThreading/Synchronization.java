package com.java.multithreading;
class Alphaa extends Thread{
	@Override
	public void run() {
		try {
			
				System.out.println(Thread.currentThread().getName()+" is executing stmt1");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" is executing stmt2");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" is executing stmt3");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" is executing stmt4");
				Thread.sleep(3000);
		synchronized (this){
			System.out.println(Thread.currentThread().getName()+" is executing stmt5");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is executing stmt6");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is executing stmt7");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}

class BathRoom{
  void bathRoom() {
		try {
				System.out.println(Thread.currentThread().getName()+" is executing stmt1");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" is executing stmt2");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" is executing stmt3");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" is executing stmt4");
				Thread.sleep(3000);
		synchronized (this){
			System.out.println(Thread.currentThread().getName()+" is executing stmt5");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is executing stmt6");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is executing stmt7");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class Boy extends Thread{
	BathRoom ba;
	Boy(BathRoom ba){
		this.ba = ba;
	}
	public void run() {
		ba.bathRoom();
	}
}
class Girl extends Thread{
	BathRoom ba;
	Girl(BathRoom ba){
		this.ba = ba;
	}
	@Override
	public void run() {
		ba.bathRoom();
	}
}
class  Others extends Thread{
	BathRoom ba;
	Others(BathRoom ba){
		this.ba = ba;
	}
	@Override
	public void run() {
		ba.bathRoom();
	}
}
public class Synchronization {

	public static void main(String[] args) {
		
		BathRoom ba = new BathRoom();
		
		Boy b = new Boy(ba);
		Girl g =  new Girl(ba);
		Others o = new Others(ba);
		
		b.setName("Boy");
		g.setName("Girl");
		o.setName("Others");
		
		b.start();
		g.start();
		o.start();
		
		
//		Alphaa a = new Alphaa();
//		Betaa be = new Betaa();
//		
//		a.setName("Alpha");
//		be.setName("Beta");
//		
//		a.start();
//		be.start();
		
		

	}

}
