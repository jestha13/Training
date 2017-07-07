package com.cubic.training.variables;

public class EmpCubicClass {
	
	int id;
	String name;
	double salary;
	double bonus;
	static String Company;
    public EmpCubicClass(int id, String name,int salary, double bonus)
	
	{
		super();   //id,name - constructor
		this.id = id; 
		this.name = name;
		this.salary = salary;
	     this.bonus = bonus;
	}
	
	public EmpCubicClass(int id, String name)
	
	{
		super();   //id,name - constructor
		this.id = id; 
		this.name = name;
	//	this.salary = salary;
		// this.bonus = bonus;
	}
	
	
	
	static
	{
		Company ="Cubic";
}
	EmpCubicClass (  int salary)
	{
		super();
		
		this.salary = salary; //salary - constructor
		
		
	}
	
	EmpCubicClass ( double bonus)
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
		System.out.println("Emmployee bonus is " + bonus);
		System.out.println("" );

	}
	

}

