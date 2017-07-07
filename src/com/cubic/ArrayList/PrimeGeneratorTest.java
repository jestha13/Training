package com.cubic.ArrayList;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PrimeGeneratorTest {

	@Test
	public void testPrimeGenerator() {
		PrimeGenerator p=new PrimeGenerator();
		p.GetPrimeNumbers(0, 20);
		int []a={3,5,7,11,13,17,19};
		//Assert.assertArrayEquals(a, p.value );
		Assert.assertArrayEquals(a, p.GetPrimeNumbers(0, 20) );//compares array
		/*for(int i =0;i<p.value.length;i++){
			assertEquals(a[i], p.value[i]);
		}*/
		
	}}
