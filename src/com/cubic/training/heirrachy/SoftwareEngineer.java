package com.cubic.training.heirrachy;

public class SoftwareEngineer extends Employee123{
	int bonus;

	public SoftwareEngineer(int id, String name, int salary, int bonus) {
		super(id, name, salary);
		this.bonus=bonus;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SoftwareEngineer E=new SoftwareEngineer(123, "Sonam", 75000, 5000);
    System.out.println("Name: "+E.name);
    System.out.println("Id: "+E.id);
    System.out.println("Salary: "+E.salary);
    System.out.println("Bonus: "+E.bonus);
	}

}
