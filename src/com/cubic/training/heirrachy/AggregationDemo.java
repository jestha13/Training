package com.cubic.training.heirrachy;

  class Address {
	
	public String streetName;
	String city;
	String state;
	int zipCode;
	
	
}
 
 class Employee1  {
	   int id;
	   String name;
	   float salary;
	   static String company;
	   
	   Address addr ;
	   
	   
	   public Employee1(int id,String name,float salary,Address address) {
   		this.id = id;
   		this.name = name;
   		this.salary = salary;
   		this.addr = address;
   		this.addr.city = "Irving";
   		this.addr.state = "Texas";
   		this.addr.zipCode = 75038;
   		this.addr.streetName = "5332 Street";
   		
   		
   	}
	   void display() {
		   System.out.println(id);
		   System.out.println(name);
		   System.out.println(salary);
		   System.out.println(addr.streetName);
		   System.out.println(addr.city);
		   System.out.println(addr.state);
		   System.out.println(addr.zipCode);
	   }

}

public class AggregationDemo {
  
	 public static void main(String[] args) {
		 
		 Employee1 emp = new Employee1(101,"Sonam",4000,new Address()); 
		 emp.display();
		 
	 }
}
