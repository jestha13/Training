package com.cubic.multithreading; 

import java.util.Scanner; 

public class User1 extends Thread
{ 
    BankingThread bt; 
     
    User1(BankingThread bt)
    { 
        this.bt=bt; 
    } 
    public void run()
    { 
        int x=1; 
        while(x==1)
        { 
        	
        	System.out.println(Thread.currentThread().getName()+" : Press 1 to withraw or 2 to deposits or 3 to exit?"); 
        	Scanner s=new Scanner(System.in); 
        	int a = s.nextInt(); 
        	switch(a) 
        	{ 
        		case 1: 
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
        		case 2: 
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
        		case 3: 
        		{ 
        			x=0; 
        			//System.out.println(Thread.currentThread().getName()+"'s Transcation is completed"); 
        		}          
        	} 
        } 
    } 
} 
