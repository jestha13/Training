package com.cubic.training.variables;

public class Car {
	
	
	String name = "Camry";
	int model = 2010;
	
	static String company = "toyota";
	
	
	public void start() {
		int initialspeed = 20;
		System.out.println("Started");

	}

	public static void main(String[] args) {
		int speed = 10;
        System.out.println("Car started and running at "+ speed);
        
        Car camry = new Car();
        Car corolla = new Car();
        
        camry.name = "Camry";
        camry.model = 2010;
        camry.company = "Nissan";
        
        
        
        
        corolla.name = "Corolla";
        corolla.model = 2011;
        corolla.company = "Toyota";
        
        System.out.println(camry.name);
        System.out.println( camry.model);
        System.out.println(camry.company);
        
        System.out.println(corolla.name);
        System.out.println( corolla.model);
        System.out.println(corolla.company);
	}
	
	
}
