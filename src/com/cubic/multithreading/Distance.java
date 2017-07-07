package com.cubic.multithreading;

public class Distance implements Runnable {
	double x;
	public Distance(double x){
		this.x=x;
		
	}
	public void calculate(){
		double meter = x/100;
		 System.out.println(x+"cm = "+meter+" m");
	}
	
		public void run(){
			calculate();
			
			 
		 } 
}
