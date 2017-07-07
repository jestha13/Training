package com.cubic.multithreading; 

import java.util.Scanner; 

public class User2 extends Thread
{ 
    BankingThread bt; 
     
    User2(BankingThread bt)
    { 
        this.bt=bt; 
    } 
    public void run()
    { 
        int x=1; 
        while(x==1)
        { 
        	System.out.println(Thread.currentThread().getName()+" : Press 4 to withraw or 5 to deposits or 6 to exit?"); 
        	Scanner s=new Scanner(System.in); 
        	int a = s.nextInt(); 
        	switch(a) 
        	{ 
        		case 4: 
        		{ 
        			System.out.println(Thread.currentThread().getName()+" :Enter an amount to withdraw:"); 
        			Scanner sc=new Scanner(System.in); 
        			Double amt = sc.nextDouble(); 
        			synchronized(bt)
                	{
        				try {
							bt.Withdraw(amt);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
                	}
        			//notify();
        			
        			break; 
        		} 
        		case 5: 
        		{ 
        			System.out.println(Thread.currentThread().getName()+" :Enter an amount to deposits:"); 
        			Scanner sc=new Scanner(System.in); 
        			Double amt = sc.nextDouble();
        			synchronized(bt)
                	{
        				try {
							bt.Deposit(amt);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                	}
        			//notify();
        			break;         
        		} 
        		case 6: 
        		{ 
        			x=0; 
        			//System.out.println(Thread.currentThread().getName()+"'s Transcation is completed");
        		}          
        	} 
        } 
    } 
} 
