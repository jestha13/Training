package com.cubic.training.heirrachy;

public class Acct_Details extends Saving_Acc {
	int deposits;
	int withdrawals;
	
	public Acct_Details(int deposits, int withdrawals,int min_bal, int saving_bal,String cust_name,int acc_no){
		super(min_bal,saving_bal,cust_name,acc_no);
		this.deposits=deposits;
		this.withdrawals=withdrawals;
	}
	void display2(){
		System.out.println("-----Account details Info---------");
		  System.out.println("Deposists:"+deposits);
		  System.out.println("Withdrawals:"+withdrawals);
	 }
}
