package com.cubic.training.variables;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringName {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x = 0;
		ArrayList<String> nameArray = new ArrayList<String>();
		
		while(x==0)
		{
			System.out.println("Enter number of names:");
			Scanner input = new Scanner(System.in);
			String name1 = input.nextLine();
			String name = name1.toLowerCase();
			
			if(nameArray.contains(name))
			{
				System.out.println("Please enter unique name input: ");
			}
			else
			{
				nameArray.add(name); 
				System.out.println("\n please type E command to Exit the loop");
				if(name.equalsIgnoreCase("E"))
				{
					x = 1;
				}					
			}
		}
		for(String item : nameArray)
		{
			System.out.println(item);
		}
		
	}
		
}
	
    


