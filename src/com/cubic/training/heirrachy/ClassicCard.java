package com.cubic.training.heirrachy;

public class ClassicCard extends CreditCard{
	int rewards;
	 public ClassicCard (int rewards){
		 this.rewards=rewards;
	 }
	 public void redeemNow(){
		 
	     if (rewards>25){
	    	 System.out.println("Rewards:"+rewards);
		 }
		 else  
			 System.out.println("you cannot redeem the points now");
		 
		 }
}
