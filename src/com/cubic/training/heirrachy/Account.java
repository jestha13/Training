package com.cubic.training.heirrachy;

public class Account {
	String cust_name;
	int acc_no;
 public Account(String cust_name,int acc_no){
	 this.cust_name=cust_name;
	 this.acc_no =acc_no;
	 
 }
  void display(){
	  System.out.println("-----Account Info---------");
	  System.out.println("Name:"+cust_name);
	  System.out.println("ACC No:"+acc_no);
  }
}
