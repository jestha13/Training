package com.cubic.multithreading;

public class LocalInnerDemo {
    void display1(){
	      class Local{
	    	  void display(){
	    		  System.out.println("From local inner class");
	    	  }
	      }
	        Local lc=new Local();
	        lc.display();
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              LocalInnerDemo oc = new LocalInnerDemo();
              oc.display1();
	}

}
