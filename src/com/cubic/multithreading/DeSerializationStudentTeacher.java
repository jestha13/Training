package com.cubic.multithreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationStudentTeacher {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fi = new FileInputStream("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\student.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		System.out.println((Teacher)oi.readObject());
		oi.close();
		
	}
}