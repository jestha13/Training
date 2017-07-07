package com.cubic.training.variables;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//........Java Unchecked RuntimeException..............
		String s=null;
		System.out.println("Enter a number");
		Scanner sc =new Scanner(System.in);
		int ab = sc.nextInt();
		System.out.println("Enter a numer of arrays");
		Scanner scd =new Scanner(System.in);
		int abc = scd.nextInt();
		System.out.println("Enter a index to store");
		Scanner scde =new Scanner(System.in);
		int i = scde.nextInt();
		/*System.out.println("Enter a index to print");
		Scanner scdef =new Scanner(System.in);
		int ij = scdef.nextInt();*/
		try 
		  { 
			 int a[]=new int[abc];
			 a[i]=30/ab;
			 String b=s;
			 		// System.out.println(a[ij]);
			 		 System.out.println(s.length());//NullPointerException
		  }
			 
		 catch(ArithmeticException e){System.out.println(e);}
		 catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
		 catch(NullPointerException e){System.out.println(e);}  
		System.out.println("Rest of Code");
	}
}
