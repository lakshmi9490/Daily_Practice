package com.java.multithreading;
class Queue{
	private int data ;
	boolean isDataPresent;
	public synchronized void setData(int data) {
		if(isDataPresent==false) {
			this.data = data;
			System.out.println("Producer produced the value "+data);
			isDataPresent = true;
			notify();
		}else {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	public synchronized void getData() {
		if(isDataPresent==true) {
			System.out.println("Consumer consumed the value "+data);
			isDataPresent = false;
			notify();
		}else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
class Producer extends Thread{
	Queue q;
	Producer(Queue q){
		this.q = q;
	}
	@Override
	public void run() {
		int i = 1;
		for(;;) {
			q.setData(i++);
		}
	}
}
class Consumer extends Thread{
	Queue q;
	Consumer(Queue q){
		this.q = q;
	}
	@Override
	public void run() {
		for(;;) {
			q.getData();
		}
		
	}
}
public class ProducerAndConsumer {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		p.setName("Producer");
		c.setName("Consumer");
		
		p.start();
		c.start();
		
		

	}

}
