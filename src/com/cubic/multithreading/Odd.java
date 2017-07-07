package com.cubic.multithreading;

public class Odd extends Thread{

	public void run() {
		
		//System.out.println("-------odd numbers :0 to 20------");
		for (int i = 0; i < 20; i++) { 
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     int a = i % 2;
		     if (a!=0){
		    	   	 System.out.println("\t"+i);
		    	   	//System.out.println(i);
		     }
	}

}
}
