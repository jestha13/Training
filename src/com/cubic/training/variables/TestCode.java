package com.cubic.training.variables;

public class TestCode {
	
		 int id;

		 String name;

		 int score ;

		 String grade;

		  TestCode(int Id,String Name,int Score){

		  id=Id;

		  name=Name;

		  score=Score;

		  if(score>50 && score<60){

		  System.out.println("Grade is C");

		 

		  }

		  else if(score>60 && score<70){

		  System.out.println("Grdae is B");

		  }

		  else

		  {

		  System.out.println("Grade is A");

		  }

		 

		 

		  }

		 

		 

		public static void main(String[] args) {

		TestCode stud1=new TestCode(01,"krishna",90);



		}



		}


