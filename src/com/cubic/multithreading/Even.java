package com.cubic.multithreading;

public class Even extends Thread {

	public void run() {
		
		//System.out.println("--------- even numbers:0 t0 20----------");
		for (int i = 0; i < 20; i++) { 
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     int a = i % 2;
		     if (a==0){
		    	 
		    	   	 System.out.println(i+2);
		     }
	}

	}
}
