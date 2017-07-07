package com.cubic.multithreading;

import java.io.Serializable;
import java.util.Scanner;

public class Stud implements Serializable{
	int id;
	String name;
	Double score;
	String grade;
	public Stud(int id, String name, Double score) {	
		this.id = id;
		this.name = name;
		this.score = score;
		
		GradeCalculation();
	}
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", score=" + score + ", grade=" + grade + "]";
	}
	public void GradeCalculation()
	{
		if(score >= 90)
			grade="A";
		else if(score >=80 && score <90)
			grade = "B";
		else
			grade = "FAIL";
		
		System.out.println("Student Id: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("Student Score: " + score );
		System.out.println("Student Grade: " + grade);
	}
	
}
