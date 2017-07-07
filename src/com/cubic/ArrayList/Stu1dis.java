package com.cubic.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Stu1dis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Student Details:");
		ArrayList<Student1> al = new ArrayList<Student1>();
		
		while(true){
			  System.out.println("Press 'Y' to add;Press 'N' to exit::");
			  Scanner sd= new Scanner(System.in);
			  String input= sd.next();
			  if(input.equalsIgnoreCase("Y")){
				  System.out.println("Enter Id,Name,Score:");
				  Scanner s= new Scanner(System.in);
				  int id =s.nextInt();
				  Scanner sc= new Scanner(System.in);
				  String name=sc.next();
				  Scanner scd= new Scanner(System.in);
				  double score=scd.nextDouble();
		         		          
				
				  Student1 n=new Student1(id, name, score);
				  al.add(n);
				  n.setId(id);
				  n.setName(name);
				  n.setScore(score);
			  }
			  else{
				  break;
					  }
			  }
				System.out.println("The names added:");
				for(int a =0; a<al.size();a++){
					Student1 nm=al.get(a);
					System.out.println(a+1+": ID: "+nm.getId()+" Name: "+nm.getName()+" Score: "+nm.getScore());
			 
		}
		
		
		          
	}
}
