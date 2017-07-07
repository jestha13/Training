package com.cubic.multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Filewriterdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
       // FileWriter fw = new FileWriter("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\filewriter.txt"); 
        PrintWriter pw = new PrintWriter("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\printwriter.txt");
        //fw.write("java programming");//takes data as string
        //fw.close();
        pw.println();
        pw.println("java");
        pw.print("language"); 
        pw.close();
	}

}
