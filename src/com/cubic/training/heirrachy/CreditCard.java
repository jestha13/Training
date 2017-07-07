package com.cubic.training.heirrachy;

public class  CreditCard implements SherpaTravel {
	double creditLimit;
	String name;
	double creditAvailable=1000.0;
	int currentbalance;
	//int rewards;
	
	public double charge(double amnt){
		
		creditAvailable=creditAvailable-amnt;
		System.out.println("credit available after deduction of :"+amnt+"is"+creditAvailable);
		return creditAvailable;
	}
     public double makePayment(double amnt){
    	 creditAvailable=creditAvailable + amnt;
    	 System.out.println("payment of:"+amnt+" is success and balancce is:"+creditAvailable);
         return creditAvailable;
     }
	@Override
	public void redeemNow() {
		// TODO Auto-generated method stub
		
	}
}
