package com.cubic.multithreading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudteaSerial {

	public static void main(String[] args) throws IOException {
		String grade;
		System.out.println("Enter your Student ID:");
		Scanner sc =new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println("Enter your Name:");
		Scanner scd =new Scanner(System.in);
		String nam=scd.next();
		System.out.println("Enter your Score:");
		Scanner sca =new Scanner(System.in);
		double s=sca.nextDouble();
		
		if(s >= 90)
			grade="A";
		else if(s >=80 && s <90)
			grade = "B";
		else
			grade = "FAIL";
		
		System.out.println("Student Id: " + i);
		System.out.println("Student Name: " + nam);
		System.out.println("Student Score: " + s );
		System.out.println("Student Grade: " + grade);
	
		Teacher tea=new Teacher(i,nam,s,grade);
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\student.txt");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
		os.writeObject(tea);
		
		System.out.println("Serialization successful...");
		os.close();
		
		
	}
		
		
}

