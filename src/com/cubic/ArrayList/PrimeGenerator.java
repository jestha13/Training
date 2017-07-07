package com.cubic.ArrayList;
  
public class PrimeGenerator {
	int[] value = new int[7];
	public int [] GetPrimeNumbers (int a, int b) {
		
		int x=0;
		for (int i=a; i<b; i++) {
	        for (int j=2; j<i; j++)
	        {
	            if (i % j == 0) 
	                break;
	                else if (i == j+1){
	            value[x]=i;
	            x++;
	            //System.out.println(i);
	            }
	               
	        }
		}
		return value;
	}
	public static void main(String[] args) {
		PrimeGenerator p= new PrimeGenerator();
		int[] value =p.GetPrimeNumbers(0, 20);
		for(int i=0; i<value.length; i++)
			System.out.println(value[i]);
		
		
		}
	

}
