package com.cubic.multithreading;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	
	
	public boolean WriteToFile(String s) throws IOException{
		FileWriter fw;
		try {
			fw = new FileWriter("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\fieio.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
		fw.write(s);
		fw.close();
		return true;
	}
	
	public String ReadToFile() throws IOException{
		FileReader fr =new FileReader("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\fieio.txt");
		char[] carr=new char[100];
		int i;
		int j=0;
		while((i=fr.read())!=-1){
			carr[j]=(char)i;
			j++;
		}
		fr.close();
		String s=String.valueOf(carr);
		String s1=s.toString();
		return s1;
		
	}
	
	
}
