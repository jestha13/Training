package com.cubic.training.heirrachy;


import java.util.Scanner;

public class Billing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
					p.setName1(type);
					System.out.println("The cost of "+type+" potatoe is: "+p.getCost());
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
					System.out.println("The cost of "+type+" egg is: "+e.getCost());
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
					System.out.println("The cost of "+type+" icecream is: "+ice.getCost());
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
					System.out.println("The cost of "+type+" sundae is: "+sun.getCost());
					break;
				}
			}
			
	}

	
}


