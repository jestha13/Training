package com.cubic.training.variables;

public class Student1 {
	String name = "Student";
	int id=123;
	static String course = "JAVA";	

	public static void main(String[] args) {
		
	Student1 s1= new Student1 ();
		
	s1.id = 01;
	s1.name = "Blake";
	
	System.out.println( "Student Name = " +  s1.name);
	System.out.println("Student Id = " + s1.id);
	System.out.println("Student Course = " + course);
	
	Student1 s2 = new Student1 ();
	s2.id = 02;
	s2.name = "Subodh";
			
	System.out.println("===================================");
	System.out.println( "Student Id = " + s2.id);
	System.out.println( "Student Name = " + s2.name);
	System.out.println("Student Course = " + s1.course);
	

	}
}
