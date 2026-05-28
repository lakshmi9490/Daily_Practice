package com.java.multithreading;
class Warrior extends Thread{
	String power1 = "Brahmastra";
	String power2 = "Pashupatastra";
	String power3 = "Sarpastra";
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Arjuna")) {
			arjuna();
		}else {
			karna();
		}
	}
	void arjuna() {
		try {
			Thread.sleep(5000);
			synchronized(power1) {
				System.out.println("Arjuna acquired Brahmastra");
				Thread.sleep(5000);
				synchronized(power2) {
					System.out.println("Arjuna acquired Pashupatastra");
					Thread.sleep(5000);
					synchronized(power3) {
						System.out.println("Arjuna acquired Sarpastra");
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	void karna() {
		try {
			Thread.sleep(5000);
			synchronized(power3) {
				System.out.println("Karna acquired Sarpastra");
				Thread.sleep(5000);
				synchronized(power2) {
					System.out.println("Karna acquired Pashupatastra");
					Thread.sleep(5000);
					synchronized(power1) {
						System.out.println("Karna acquired Brahmastra");
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
public class LifeCycleOfThread {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior();
		Warrior w2 = new Warrior();
		
		w1.setName("Arjuna");
		w2.setName("Karna");
		
		w1.start();
		w2.start();

	}

}
