package com.cubic.training.variables;

public class Employee {
	
	int id;
	String name;
	double salary;
	double bonus;
	static String Company;
	
	public Employee(int id, String name)
	
	{
		super();   //id,name - constructor
		this.id = id; 
		this.name = name;
	//	this.salary = salary;
		// this.bonus = bonus;
	}
	
	public Employee(int id, String name,int salary, double bonus)
	
	{
		super();   //id,name - constructor
		this.id = id; 
		this.name = name;
		this.salary = salary;
	     this.bonus = bonus;
	}
	
	static
	{
		Company ="Cubic";
}
	Employee (  int salary)
	{
		super();
		
		this.salary = salary; //salary - constructor
		
		
	}
	
	Employee ( double bonus)
	{
		super();
		
		this.bonus = bonus; //salary - constructor
	}
	
	
	void display ()
	{
		System.out.println("Employee id is " + id);
		System.out.println("Employee name is " + name);
		System.out.println("Employee Salary is "+ salary);
		System.out.println("Employee company is " + Company);
		System.out.println("Emmployee bonus is" + bonus);
		System.out.println("" );

	}
	
public static void main(String[] args) 
	{
	    
		Employee emp = new Employee(321,"josh",1000,500);
		Employee emp1 = new Employee(111,"sam");
		Employee emp2 = new Employee(222,"blake");
		
		emp.display();
		emp1.display();
		emp2.display();

	
}
}

