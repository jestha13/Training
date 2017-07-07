package com.cubic.multithreading;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudTest {
	
	
	@Test
	public void testGradeCalculation() {
		Stud st=new Stud(123, "sonam", 80.0);
		st.GradeCalculation();
		assertEquals("B",st.grade);
		
		
	}

}
