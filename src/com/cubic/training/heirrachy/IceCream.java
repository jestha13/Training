package com.cubic.training.heirrachy;

public class IceCream extends RetailItem {
int num;
double cost;
	public IceCream(String name,int num) {
		super(name);
		this.num=num;
		//this.cost=cost;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		if(name.equalsIgnoreCase("vanilla")){
			cost=num*3.5;
		}
		else if(name.equalsIgnoreCase("chocalate")){
			cost=num*5.5;
		}
		
		
		return (int) cost;
	}

}
