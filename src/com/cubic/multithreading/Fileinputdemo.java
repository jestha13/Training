package com.cubic.multithreading;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Fileinputdemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\cubic2.txt");
      FileOutputStream fout =new FileOutputStream("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\cubic2.txt");
        //BufferedOutputStream bout=new BufferedOutputStream(fout);*/
       /*//BufferedInputStream bin =new BufferedInputStream(fin);
        /////////
        //File f =new File("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\cubic1.txt");
        FileOutputStream fout1 = null;
        if(!f.exists()){
        	fout1 =new FileOutputStream("C:\\Users\\tsher_000\\Desktop\\Cubic\\basic java\\cubic2.txt");
        }
        
        BufferedOutputStream bout1=new BufferedOutputStream(fout1);
        
        
        String s="Cubic Technologieshjhghjgjhghg";
        byte[] b =s.getBytes();
       */
      PrintStream ps = new PrintStream(fout);
      ps.println("sonam");
      ps.println("sherpa");
        //fout.write(65);
        int s=fin.read();
        System.out.println(s);
     // fout.write(10);
     // fout.write(66);
     // fout.close();
        //bin.close();
        //bout1.flush
        //bout.flush();
        //fout.write(b);
        //System.out.println((char)bin.read());
        
        /*bout.write(70);
        bout.flush();*/
        //fout1.close();
        //fin.close();
        //fout1.close();
       
        //fout.write(65);
		/*int s;
		while((s= fin.read())!=-1){
		System.out.println((char) fin.read());
		}*/
        ps.close();
	}

}
