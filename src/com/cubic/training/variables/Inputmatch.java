package com.cubic.training.variables;

import java.util.Scanner;

public class Inputmatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0;
		System.out.println("Enter a phrase with 5 words:");
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 =s.split(" ");
        
        System.out.println("Enter the a word that is one of the 5 words:");
        Scanner scd= new Scanner(System.in);
        String s2 = scd.nextLine();
                    	
        for(int j = 0;j<s1.length;j++) {
        	if(s1[j].equalsIgnoreCase(s2)) {
        		a++;
        		
        	}
        	}
        if(a>0){System.out.println("Matched");}
        else
        	System.out.println("Not Matched");
        
	}

}
