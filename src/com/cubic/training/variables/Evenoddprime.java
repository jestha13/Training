package com.cubic.training.variables;

public class Evenoddprime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------- even numbers:0 t0 10----------");
		for (int i = 0; i < 10; i++) { 
		     int a = i % 2;
		     if (a==0){
		    	 
		    	   	 System.out.println(i+2);
		     }
		}
		System.out.println("-------odd numbers :0 to 10------");
		for (int i = 0; i < 10; i++) { 
		     int a = i % 2;
		     if (a!=0){
		    	   	 System.out.println(i);
		     }
		}
System.out.println("prime numbers 0 to 50");
int a =0;
int b=50;
		 for (int i=a; i<b; i++) 
		        for (int j=2; j<i; j++)
		        {
		            if (i % j == 0) 
		                break;
		            else if (i == j+1)
		                System.out.println(i);

		        }   
		    
	}

}
