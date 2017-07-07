package com.cubic.training.heirrachy;

public class Emp {

	String name;
	int salary;
	Address1 addr;
	Employer employer;
	
	public Emp(String name,int salary, Address1 addres,Employer employ){
		this.name=name;
		this.salary=salary;
		this.addr=addres;
		this.addr.cityName="irving";
		this.addr.state="tx";
		this.addr.zipCode=75038;
		this.employer=employ;
		this.employer.address="beltline";
		this.employer.empName="cubic";
		this.employer.revenue=500000;
		this.employer.yearEst=2000;
		
	}
	void display(){
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
		System.out.println("city:"+addr.cityName);
		System.out.println("state:"+addr.state);
		System.out.println("zipcode:"+addr.zipCode);
		System.out.println("Emp Add:"+employer.address);
		System.out.println("Emp Name:"+employer.empName);
		System.out.println("Emp Revenue:"+employer.revenue);
		System.out.println("Year Established:"+employer.yearEst);
	}
}
