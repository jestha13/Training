package com.cubic.training.variables;

import java.util.Scanner;

public class StringRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		System.out.println("Enter a phrase with repeated words:");
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 =s.split(" ");
        
        
        System.out.println("Enter the repeated word:");
        Scanner scd= new Scanner(System.in);
        String s2 = scd.nextLine();
                    	
        for(int j = 0;j<s1.length;j++) {
        	if(s1[j].equalsIgnoreCase(s2)) {
        		c++;
        	}
        }
        System.out.println("Repeated count of "+s2+ " is " + c);
	}

}
