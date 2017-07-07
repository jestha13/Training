package com.cubic.training.variables;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class StudentTest {
    static Student st;
    int paramscore;
    
    public StudentTest(int score){
    	this.paramscore=score;
    }
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		st=new Student();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Parameterized.Parameters
	public static List<Integer> getscores(){
		Integer[] scores = new Integer[]{80,89,81};
		return Arrays.asList(scores);
		
	}

	@Test
	public void testGetGrade() {
		assertEquals("B", st.getGrade(paramscore));
	}

}
