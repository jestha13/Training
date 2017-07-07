package com.cubic.multithreading;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Derisialstud {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
				FileInputStream fin = new FileInputStream("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\TestSerialization.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);
				
				System.out.println((Stud)oin.readObject());
				oin.close();
				
	}

}
