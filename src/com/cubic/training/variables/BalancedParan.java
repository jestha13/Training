package com.cubic.training.variables;

import java.util.Scanner;

public class BalancedParan {
	public static void main(String[] args) {
	int a = 0,b=0,c=0,a1 = 0,b1=0,c1=0;
	  System.out.println("Enter a string with parenthesis");
	  Scanner sc=new Scanner(System.in);
	  String s =sc.next();
	  for(int i =0;i<s.length();i++){
		  if(s.substring(i,i+1).equals("(")){
			   a++;
		  }
		  if(s.substring(i,i+1).equals("{")){
			   b++;
		  }
		  if(s.substring(i,i+1).equals("[")){
			   c++;
		  }
		  if(s.substring(i,i+1).equals(")")){
			   a1++;
		  }
		  if(s.substring(i,i+1).equals("}")){
			   b1++;
		  }
		  if(s.substring(i,i+1).equals("]")){
			   c1++;
		  }
	  }
	  if(a == a1 && b ==b1 && c==c1){
		  System.out.println("balanced");
	  }
	  else{
		  System.out.println("unbalanced");
		  }
	  
	}
}
