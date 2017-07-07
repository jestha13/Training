package com.cubic.ArrayList;

public class Potatoes extends RetailItem {
double weight;
double cost;

	public Potatoes(String name, double weight) {
		super(name);
		this.weight=weight;
		//this.cost=cost;
	}

	public int getCost() {
		
		if (name.equalsIgnoreCase("sweet")){
			
		cost =weight*2;
		}
		else if (name.equalsIgnoreCase("normal")){
		cost =weight*4;
		}
		
		return (int) cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Potatoes [weight=" + weight + ", cost=" + cost +  "]";
	}

	
	

	
	

	
	

}
