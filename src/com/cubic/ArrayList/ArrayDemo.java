package com.cubic.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.StyledTextAction;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> std= new ArrayList<String>(); 		
        
		while(true){
			  System.out.println("Enter a name:Press 'N' to exit:");
	          Scanner sc= new Scanner(System.in);
			  String name=sc.next();
			  
			  if(name.equalsIgnoreCase("N")){
			  break;
			  }
			  else{
				  String n = name.toLowerCase();
				  if(std.contains(n))
				  {
					  System.out.println("Enter the Unique Name: Press N to Exit");
				  }
				  else
					  std.add(name);
			  }          
		}
		Iterator<String> it=std.iterator();
		System.out.println("The names added:");
		  while(it.hasNext()){
			  System.out.println(it.next());
		  }
		  System.out.println("La vayo bro !!!!sahi ho!!");
	}
}




