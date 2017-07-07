package com.cubic.training.heirrachy;

public class CashRewardsCard extends CreditCard {
	int rewards;
	String x;
	public CashRewardsCard(int rewards){
		this.rewards=rewards;
	}
	
 public void redeemNow(){
	 
     if (rewards>25){
    	 x="You can redeem rewards.";
    	 System.out.println(x+" Rewards: "+rewards);
	 }
	 else { 
		 x="you cannot redeem the points now.";
		 System.out.println(x);
	 }
	 }
	
public double charge(double amnt){
	creditAvailable=creditAvailable-amnt;
	rewards+=10;
	System.out.println("the credit available after :"+amnt+ "is"+creditAvailable+"\nthe total available rewards is:"+rewards);
return creditAvailable;
}
 }

