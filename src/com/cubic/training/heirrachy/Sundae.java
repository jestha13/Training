package com.cubic.training.heirrachy;

public class Sundae extends IceCream {
	String name1;

	public Sundae(String name1,String name,int num) {
		super(name, num);
		this.name1=name1;
	}
	
		
		public int getCost() {
			IceCream i =new IceCream(name, num);
			if(name1.equalsIgnoreCase("banana")){
				cost=i.getCost()+3.5;
			}
			else if(name1.equalsIgnoreCase("strawberry")){
				cost=i.getCost()+5.5;
			}
			
			return (int) cost;
	}

}
