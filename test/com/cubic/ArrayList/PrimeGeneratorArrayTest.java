package com.cubic.ArrayList;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PrimeGeneratorArrayTest {

	@Test
	public void testPrimeGenerator() {
		 PrimeGeneratorArray pg=new PrimeGeneratorArray();
		 pg.GetPrimeGenerator(0, 20);
		 ArrayList<Integer> a= new ArrayList<>();
		 a.add(3);
		 a.add(5);
		 a.add(7);
		 a.add(1);
		 a.add(13);
		 a.add(17);
		 a.add(19);
		 
			
			//Assert.assertEquals(a, pg.al);
		    assertEquals(a, pg.al);
	}

}
