package com.cubic.training.heirrachy;

public class Potatoes extends RetailItem {
double weight;
double cost;
String name1;
	public Potatoes(String name, double weight) {
		super(name);
		this.weight=weight;
		//this.cost=cost;
	}

	public int getCost() {
		Potatoes p = new Potatoes(name, weight);
		if (p.name.equalsIgnoreCase("sweet")){
			
		cost =weight*2;
		}
		else if (p.name.equalsIgnoreCase("normal")){
		cost =weight*4;
		}
		
		return (int) cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	
	

}
