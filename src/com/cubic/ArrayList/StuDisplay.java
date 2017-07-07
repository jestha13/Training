package com.cubic.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StuDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al = new ArrayList<Student>(); 
		while(true){
			  Student st = new Student();
			  System.out.println("Enter Student Details: 1) Name 2)Id 3) Score : Press 'N' to exit:");
			  
			  Scanner sc= new Scanner(System.in);
	          String name=sc.next();
	          if(name.equalsIgnoreCase("N")){
				  break;
				  }
	          else
	          {
	        	  st.setName(name);
	        	  Scanner s= new Scanner(System.in);
				  int id =s.nextInt();
				  st.setId(id);
		          Scanner scd= new Scanner(System.in);
		          double score=scd.nextDouble();
		          st.setScore(score);
		          
		          al.add(st);
		                   
		    
	          }
		}
		
		/*for(int i=0; i<al.size(); i++)
		{
			System.out.println();
		}
		Iterator<Student> it=al.iterator();
		System.out.println("The names added:");
		  while(it.hasNext()){
			  System.out.println(it.next());
		  }*/
		 System.out.println("Do you want to sort students?(YES/NO)");
		 Scanner sd=new Scanner(System.in);
         String in =sd.next();
         if(in.equalsIgnoreCase("yes")){
       	  System.out.println("Choose a method: 1)Score 2)Id");
       	  String x=sd.next();
       	  if(x.equalsIgnoreCase("id")){
       		 Collections.sort(al, new IdComparator());
       	  }
       	  else  if(x.equalsIgnoreCase("score")){
	        		 Collections.sort(al, new ScoreComparator());
	        	  }
         } 
		for(Student s :al){
			System.out.println(s);
		}
	}

}
