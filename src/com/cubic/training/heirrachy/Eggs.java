package com.cubic.training.heirrachy;

public class Eggs extends RetailItem {
double cost;
double dozen;							
	public Eggs(String name, double dozen) {
		super(name);
		this.dozen=dozen;
		//this.cost=cost;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		if(name.equalsIgnoreCase("brown")){
			cost=dozen*3;
		}
		
		else if(name.equalsIgnoreCase("white")){
		cost=dozen*4;
		}
		return (int) cost;
	}

}
