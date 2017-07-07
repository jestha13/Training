package com.cubic.multithreading;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cube {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\cube.txt");
		
		Scanner input = new Scanner(fin);

		double d, sum = 0, overalsum = 0;

		while (input.hasNextLine()) {
			d = input.nextDouble();
			if (d == -999.99) {
				System.out.println("The previous group had a sum of " + sum);
				overalsum =+ sum;
				System.out.println("The current overal had a sum of " + overalsum);
				sum = 0;
			} else {
				sum += d;
			}
		}

		System.out.println("The overall Total had a sum of " + overalsum);
		fin.close();

	}
}
