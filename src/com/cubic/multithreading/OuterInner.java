package com.cubic.multithreading;

public class OuterInner {
    public void display(){
    	System.out.println("outer class");
    }
    
    class Inner{
    	public void display(){
        	System.out.println("Inner class");
        }
    }
	public static void main(String[] args) {
		
		OuterInner oc=new OuterInner();
		OuterInner.Inner in = oc.new Inner();///obj of inner inside obj of outer
		in.display();
		oc.display();
	}
}
