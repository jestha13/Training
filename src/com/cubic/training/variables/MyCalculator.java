package com.cubic.training.variables;

import java.util.Scanner;
import java.lang.*;

public class MyCalculator  {
 void power(int p, int n){
	 double c= p;
	 double d=n;
	 
   	  try {
   		if (p<0||n<0){
			throw new InvalidNumbers("n and p should be non negative");
   		}
   		else
   			
   	        {double q =Math.pow(c, d);
   	        System.out.println(q);
   			}
		} catch (InvalidNumbers e) {
			// TODO Auto-generated catch block
			System.out.println("Enter values greater than 0");
			e.printStackTrace();
		}
     }
	 
 
	 public static void main (String[] args) {
		 System.out.println("enter a number");
         Scanner s = new Scanner(System.in);
         int a = s.nextInt();
         System.out.println("enter a number");
         Scanner sc = new Scanner(System.in);
         int b = sc.nextInt();
         MyCalculator ab=new MyCalculator();
         /* if (a<0||b<0){
        	  try {
				throw new InvalidNumbers("n and p should be non negative");
			} catch (InvalidNumbers e) {
				// TODO Auto-generated catch block
				System.out.println("Enter values greater than 0");
				e.printStackTrace();
			}
          }
          else*/
        	 ab.power(a,b);
          
          
         
	 }
	  }

