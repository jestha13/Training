package com.cubic.ArrayList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Billing {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		ArrayList al=new ArrayList();
		int total=0;
		while(true){
			
		
		System.out.println("Enter the item: Potatoes,Eggs,IceCream,Sundae");
		Scanner s= new Scanner(System.in);
		String x=s.next();
		String item=x.toLowerCase();
		switch(item)
			{
			case "potatoes":
				{	
					System.out.println("Enter the type:Sweet, Normal");
					//Scanner sc= new Scanner(System.in);
					String type=s.next();
					System.out.println("Enter the weight of potatoes:");
					//Scanner scd= new Scanner(System.in);
					double wt=s.nextDouble();
					
					Potatoes p =new Potatoes(type, wt);
					int xt=p.getCost();
					System.out.println("The cost of "+type+" potatoe is: "+xt);
					total+=xt;
					//System.out.println(total);
					al.add(p);
					System.out.println("Total cost: "+total);
					
					break;
					
				}
			case "eggs":
				{
					System.out.println("Enter the type:Brown or White");
					//Scanner sc= new Scanner(System.in);
					String type=s.next();
					System.out.println("Enter the number of dozens:");
					//Scanner s= new Scanner(System.in);
					double d=s.nextDouble();
					Eggs e =new Eggs(type,d);
					int xt=e.getCost();
					System.out.println("The cost of "+type+" egg is: "+xt);
					total+=xt;
					al.add(e);
					System.out.println("Total cost: "+total);
					break;
				}
			case "icecream":
				{
					System.out.println("Enter the type:Vanilla or chocalate");
					//Scanner sc= new Scanner(System.in);
					String type=s.next();
					System.out.println("Enter the number of scoops of icecream:");
					//Scanner scd= new Scanner(System.in);
					int no=s.nextInt();
					IceCream ice =new IceCream(type, no);
					int xt=ice.getCost();
					System.out.println("The cost of "+type+" icecream is: "+xt);
					total+=xt;
					System.out.println("Total cost: "+total);
					al.add(ice);
					break;
				}
			case "sundae":
				{
					System.out.println("Enter the type: Banana or Strawberry:");
					//Scanner sc= new Scanner(System.in);
					String type=s.next();
					System.out.println("Enter icecream:Vanilla or Chocalate");
					String icream=s.next();
					System.out.println("Enter the number of scoops of icecream in the sundae:");
					//Scanner scd= new Scanner(System.in);
					int no=s.nextInt();
					IceCream ice =new IceCream(type, no);
					Sundae sun =new Sundae(type,icream,no);
					int xt=sun.getCost();
					System.out.println("The cost of "+type+" sundae is: "+xt);
					total+=xt;
					System.out.println("Total cost: "+total);
					al.add(sun);
					break;
				}
			}
		         System.out.println("Do you want to continue: Y/N");
		         String c=s.next();
		         if(c.equalsIgnoreCase("n")){
		        	 for(int i=0; i<al.size(); i++)
		     		{
		     			System.out.println();
		     		}
		     		Iterator it=al.iterator();
		     		System.out.println("----------The items added:-----------");
		     		  while(it.hasNext()){
		     			  System.out.println(it.next());
		     			  
		     		  }
		        	 
		     		 break;
		     		 
		     		 
		         }
		        
		}
		System.out.println("The total is: "+total);
		
		
	}

	
}


