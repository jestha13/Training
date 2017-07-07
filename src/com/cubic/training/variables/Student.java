package com.cubic.training.variables;

public class Student {
	int id;
	String Name;
	int score;
	String grade;
	
	String getGrade(int score){
		if(score>=90 && score <100){
			 grade = "A";
			 return grade;
		}
		if(score>=80 && score <90){
			 grade = "B";
			 return grade;
		}
		if(score>=70 && score <80){
			 grade = "C";
			 return grade;
		}
		else{
			grade="fail";
			return grade;
		}
		
	}
}
