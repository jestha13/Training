package com.cubic.training.heirrachy;

import java.util.Scanner;

public class Person {
	public static void Transact(int amnt, CreditCard cardtype){
		if (cardtype instanceof ClassicCard){//checking the instance of cardtype
			cardtype.charge(amnt);	
			((ClassicCard) cardtype).redeemNow();
		System.out.println("---------Classic Credit--------");
		}
		else
			{System.out.println("---------Cashrewards credit---------");
			cardtype.charge(amnt);}
	
		
	}
	
  
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reward = 20;
		CreditCard cash = new CashRewardsCard(reward);//needs constructor in cashrewards to assign value to rewards.
		CreditCard classic = new ClassicCard(reward);		
		
		//cash.rewards=100;
		
		//CashRewardsCard n = new CashRewardsCard();
		//n.rewards= 400;
				
		while(true){
			
		System.out.println("Enter Credit card:");
		System.out.println("1) CashRewards 2)Classic");
		Scanner sc = new Scanner (System.in);
		String credit =sc.next();
		String x =credit.toLowerCase();
		switch(x)
		{ 
		case "cashrewards":
		{			
			System.out.println("Enter amount to be charged to the credit card:");			
			Scanner c = new Scanner(System.in);
			int amnt =c.nextInt();
				
			if (amnt<0){
			    try {
					throw new InvalidAmount("Invalid amount");
				} catch (InvalidAmount e) {
                 System.out.println("Enter value greater than 0");
				}
			}
			else
				Transact(amnt, cash);
			break;
		}
			case "classic":
			{
				System.out.println("Enter amount to be charged to the credit card:");
				Scanner c1 = new Scanner(System.in);
				int amnt =c1.nextInt();
				
				if (amnt<0){
				    try {
						throw new InvalidAmount("Invalid amount");
						
					} 
				    catch (InvalidAmount e) {
						
						e.printStackTrace();
					}
				}
				else
					Transact(amnt, classic);
				
				
				break;
			}
		}
		
		
		}
		
	}

}
