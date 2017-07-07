package com.cubic.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class PrimeGeneratorArray {
	ArrayList<Integer> al =new ArrayList<>();
	
	public ArrayList<Integer> GetPrimeGenerator(int a,int b ){
		
		
		for (int i=a; i<b; i++) {
	        for (int j=2; j<i; j++)
	        {
	            if (i % j == 0) 
	                break;
	                else if (i == j+1){
	                	al.add(i);
	            
	            }
	               
	        }
	        
	}
	
		return al;
		
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeGeneratorArray p =new PrimeGeneratorArray();
		ArrayList<Integer> al=p.GetPrimeGenerator(0, 20);
		
		Iterator<Integer> it= al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
			
		
	}*/

}
