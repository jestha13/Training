package com.cubic.training.heirrachy;

public class Saving_Acc extends Account {
	int min_bal;
	int saving_bal;
 public Saving_Acc(int min_bal, int saving_bal,String cust_name,int acc_no){
	 super(cust_name,acc_no);
	 this.min_bal=min_bal;
	 this.saving_bal =saving_bal;
 }
 void display1(){
	 System.out.println("----- Saving Account Info---------");
	  System.out.println("Saving:"+saving_bal);
	  System.out.println("Min Bal:"+min_bal);
 }
}
