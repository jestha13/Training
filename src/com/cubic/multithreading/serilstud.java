package com.cubic.multithreading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class serilstud {

	public static void main(String[] args) throws IOException 
	{		
		System.out.println("Enter your Student ID:");
		Scanner sc =new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println("Enter your Name:");
		Scanner scd =new Scanner(System.in);
		String nam=scd.next();
		System.out.println("Enter your Score:");
		Scanner sca =new Scanner(System.in);
		double s=sca.nextDouble();
		
		Stud st = new Stud(i, nam, s);
		FileOutputStream fot = new FileOutputStream("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\TestSerialization.txt");
		ObjectOutputStream ost = new ObjectOutputStream(fot);		
		
		ost.writeObject(st);
		
		ost.close();		
	}
}
