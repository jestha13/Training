package com.cubic.multithreading;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Even e=new Even();
        Odd o =new Odd();
        e.start();
        o.start();
        //o.start();
        //e.start();
	}

}
