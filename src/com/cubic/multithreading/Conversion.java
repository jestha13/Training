package com.cubic.multithreading;

import java.util.Scanner;

public class Conversion {
	static String b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	do{
    	 System.out.println("Enter a digit in centimeter:");	
         Scanner s = new Scanner(System.in);
         double a = s.nextDouble();
     Distance ct =new Distance(a);
     Thread t =new Thread(ct);
     //Thread t = new Thread(new Distance(a));
     t.start();
     try {
    	 	t.join();
	 } catch (InterruptedException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
	 }
     System.out.println("Enter C to continue");
     Scanner sc =new Scanner(System.in);
     b=sc.next();
		}while(b.equalsIgnoreCase("c"));
     
     
	}

}
