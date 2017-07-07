package com.cubic.multithreading;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FileIOTest {
    static FileIO fo;
    static Scanner sc; 
    String word;
    int count;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	//executes once before any test.used for setting up env,initializing variable.eg connecting to database//should be static
		fo=new FileIO();
		sc=new Scanner(System.in)
;		
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		sc.close();
		
		
	}//cleanup, closing connection,executes at the end

	@Before
	public void setUp() throws Exception {
		//executes before the test method
		System.out.println("Enter a word to write or read");
		word =sc.nextLine();
	}

	@After
	public void tearDown() throws Exception {
		//executes after test method
	}
	@After
	public void CleanUp() throws Exception {
		count=0;
	}

	@Test
	public void testWriteToFile() throws IOException {
		Assert.assertEquals(true, fo.WriteToFile(word));
	}

	@Test
	public void testReadToFile() throws IOException {
		fo.WriteToFile(word);
	Assert.assertNotNull(fo.ReadToFile());
	}

}
