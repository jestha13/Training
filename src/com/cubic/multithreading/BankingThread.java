package com.cubic.multithreading; 

import java.util.Scanner; 

public class BankingThread { 
double accBal=1000; 
     
     public void Deposit(double dpt ) throws InterruptedException//associated with object bt not class
    {         double newBal;
        if(dpt<0)
        { 
            System.out.println(Thread.currentThread().getName()+" :Enter value greater than O"); 
        } 
        else
        { 
            newBal= this.accBal + dpt; 
            Thread.sleep(100);
            this.accBal=newBal;
             
            System.out.println(Thread.currentThread().getName()+" :The available balance is "+this.accBal+" after deposits of "+dpt);
            //notify();
        } 
         
    } 
     
   public void Withdraw(double wtd) throws InterruptedException
   {       
        if(wtd<0)
        { 
            System.out.println(Thread.currentThread().getName()+" :Enter value greater than O");             
        } 
        else
        { 
        	if(wtd>this.accBal)
            { 
                System.out.println(Thread.currentThread().getName()+" :The withdraw amount "+ wtd+"is higgher than account balance "+this.accBal);
                System.out.println("Balance is low..Waiting for User to deposit");
                
                
            } 
        	else
        	{  // wait();
        		this.accBal= this.accBal -wtd;            
        		System.out.println(Thread.currentThread().getName()+" :The available balance is "+this.accBal+" after withdraw of "+wtd);
        		//wait();
        	}
        } 
         
    } 
     
    public static void main(String[] args) throws InterruptedException { 
        // TODO Auto-generated method stub 
         
            BankingThread bt =new BankingThread(); 
            System.out.println("Account Balance:"+bt.accBal); 
            User1 u1 = new User1(bt); 
            User2 u2 = new User2(bt); 
            
            u1.setName("User1"); 
            u2.setName("User2");
           // u1.setPriority(Thread.MAX_PRIORITY);
          //  u2.setPriority(Thread.MIN_PRIORITY);
            u1.start(); 
            //u1.join();
            u2.start(); 
            //u2.join();
             
            while(true) { 
                 
            if(!(u1.isAlive()) && !(u2.isAlive())) { 
                break; 
            } 
             
            } 
           
            System.out.println("Both the user's Transcation is completed"); 
             
    } 

} 