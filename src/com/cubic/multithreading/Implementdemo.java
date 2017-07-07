package com.cubic.multithreading;

public class Implementdemo implements Runnable{
	
		public void run(){  
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("thread is running...");  
		}  
		  
		public void run1(){  
			System.out.println("thread not running...");  
			} 
		}  


