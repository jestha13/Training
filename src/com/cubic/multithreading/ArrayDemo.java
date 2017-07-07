package com.cubic.multithreading;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] a= new int[10];
 for (int i=0; i<a.length;i++){
	 a[i]=(int) (5+10*Math.random());//generate 5to 15 randomly
 }
 
 for(int j=0; j<a.length;j++){
	 System.out.println(a[j]);
 }
	}

}
