package com.cubic.training.variables;

public class OverloadingDemo {

	void Add(int a , int b) {
       System.out.println(a+b);
	}

	void Add(int a , int b,int c) {
		System.out.println(a+b+c);
	}
	 
	void Add(int a , int b,int c,int d) {
		System.out.println(a+b);
	}
	
	 public static void main(String[] args) {
		 OverloadingDemo od = new OverloadingDemo();
		 od.Add(1,2);
		 od.Add(1, 2,3);
		 od.Add(1, 2,3,4);
	 }
}
