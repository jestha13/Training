package com.cubic.multithreading;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.util.Vector;

public class MultipleFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fin1 = new FileInputStream("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\cubic1.txt");
		FileInputStream fin2 = new FileInputStream("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\cubic2.txt");
		FileInputStream fin3 = new FileInputStream("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\cubic3.txt");
		FileOutputStream fout1 = new FileOutputStream("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\cubic4.txt"); 
		FileOutputStream fout2 = new FileOutputStream("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\cubic5.txt");
		ByteArrayOutputStream bin = new ByteArrayOutputStream();
		
		//SequenceInputStream sin =new SequenceInputStream(fin1,fin2); for 2 files only
		Vector<InputStream> streams = new Vector<>();
		streams.add(fin1);
		streams.add(fin2);
		streams.add(fin3);
		
		SequenceInputStream sin =new SequenceInputStream(streams.elements());


		int data = sin.read();
		while(data != -1){
			
		    //System.out.println( (char) data);
		    bin.write(data);
		  // fout1.write(data);
		    //fout2.write(data);
		    
		    
		    data= sin.read();
		    
		}
		bin.writeTo(fout1);
	    bin.writeTo(fout2);
	   
		fin1.close();
		fin2.close();
		fin3.close();
		sin.close();
		fout1.close();
		fout2.close();
	}

}
