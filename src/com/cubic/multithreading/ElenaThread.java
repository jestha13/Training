package com.cubic.multithreading;

public class ElenaThread extends Thread{
	Bank bt;  //Keeping a reference of another class - aggregation
	
	ElenaThread (Bank bt) {
		this.bt = bt ;
	}
	public void run() {
		
		try {
			bt.deposit(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

