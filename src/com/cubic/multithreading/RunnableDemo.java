package com.cubic.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  
			  
		    Implementdemo m1=new Implementdemo();  
			Thread t1 =new Thread(m1);  
			t1.start();  
			System.out.println("Test Run");
			m1.run1();
			 }  
			 
	

}
