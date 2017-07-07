package com.cubic.training.variables;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		
		 
		 System.out.println("Enter your age");
		 Scanner sc = new Scanner(System.in);
		 int age = sc.nextInt();

		 if (age < 25) {
			 if (age < 18) {
				if (age<16){
					System.out.println("you are not allowed to do drive");
					
				}
				
				System.out.println("you are not  allowed to vote");
			 }
			
			 System.out.println("you are not allowed to rent a car");
		 }
		 else
			 System.out.println("you are allowed to do anything legal");
			}

}
