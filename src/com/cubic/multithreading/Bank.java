package com.cubic.multithreading;

public class Bank {

	int accNumber;
	double accbalance;
	
	Bank(double accbalance) {
		this.accbalance = accbalance;
	}
	
	
	synchronized public void deposit(double amt) throws InterruptedException {
		
		
		System.out.println(Thread.currentThread().getName() + "is depositing.....");
		double newbalance;
		
		if(amt  < 0) {
			System.out.println("Amount cannot be nefative");
			
		}
		else {
			
			newbalance =  accbalance + amt; // 1200
			accbalance = newbalance;
			System.out.println("Deposit completed by " + Thread.currentThread().getName());
			notify();	   
		}
	}
	
	 public void withdraw(double amt) throws InterruptedException {
		double newbalance;
		synchronized(this){
		if(amt  > accbalance) {
         System.out.println("Balance is low..Waiting for Mark to deposit");
          wait();
          newbalance =  accbalance - amt; 
			accbalance = newbalance;
          
		}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
          
		Bank bt = new Bank(1000);
		ElenaThread Elena = new ElenaThread(bt);
		MarkThread Mark = new MarkThread(bt);
		Mark.setName("mark");
		Elena.setName("elena");
		
		
		Elena.start();
		Mark.start();
		
		
		Thread.sleep(100);
		
		System.out.println("Total balance is " + bt.accbalance );
		
		/// create new thread sam with anonymous class
		Thread sam = new Thread(){
			public void run(){
				try {
					bt.deposit(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		sam.setName("sam");
		sam.start();
		}
}
