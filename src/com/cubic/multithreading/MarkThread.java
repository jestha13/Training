package com.cubic.multithreading;

public class MarkThread extends Thread{
Bank bt;  //Keeping a reference of another class - aggregation
	
	MarkThread (Bank bt) {
		this.bt = bt ;
	}
	public void run() {
		
		try {
			bt.withdraw(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
