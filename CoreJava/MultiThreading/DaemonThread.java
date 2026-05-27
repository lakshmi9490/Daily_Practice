package com.java.multithreading;

public class DaemonThread {

	public static void main(String[] args) {
		Captain c = new Captain();
		c.start();

	}

}
class Captain extends Thread{
	@Override
	public void run() {
		try {
			BattingCoach btc = new BattingCoach();
			BowlingCoach bwc = new BowlingCoach();
			
			btc.setDaemon(true);
			bwc.setDaemon(true);

			btc.start();
			bwc.start();

			System.out.println("Captain goes to the ground");
			Thread.sleep(3000);
			System.out.println("Captain will do warm-up");
			Thread.sleep(3000);
			System.out.println("Captain will to catching practice");
			Thread.sleep(3000);
			System.out.println("Captain will to batting practice");
			Thread.sleep(3000);
			System.out.println("Captain will to bowling practice");
			Thread.sleep(2000);
			System.out.println("Captain went to Hotel");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class BattingCoach extends Thread{
	@Override
	public void run() {
		for(;;) {
			System.out.println("Batting Coach is in the ground");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class BowlingCoach extends Thread{
	@Override
	public void run() {
		for(;;) {
			System.out.println("Bowling Coach is in ground");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

