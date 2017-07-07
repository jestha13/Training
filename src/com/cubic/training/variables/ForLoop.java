package com.cubic.training.variables;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         
	        //Taking rows value from the user
	         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         
	        
	         
	        //Printing upper half of the pattern
	         
	        for (int i = 0; i <5; i++) 
	        {
	            for (int j = i; j <6-1;j++) 
	            { 
	                System.out.print("*"); 
	            } 
	             
	            System.out.println(); 
	        } 
	         
	        //Printing lower half of the pattern 
	         
	        for(int i=1;i<5;i++){
				for(int j=0;j<i+1;j++){
				System.out.print("*");
				}
				System.out.println();
				}
	       
	         
	      
	}
	}


