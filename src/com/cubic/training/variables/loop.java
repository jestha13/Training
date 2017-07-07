package com.cubic.training.variables;
import java.util.Scanner;

public class loop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
for(int a =1;a<=5;a++){
	
	for ( int i =a;i<=5;i++){
	
	System.out.print(i);
}
System.out.println();
	}
int factorial = 1;
System.out.println("Eneter a number");
Scanner sc = new Scanner (System.in);
int num =sc.nextInt();
for(int i = 1; i <=num; ++i)
{
    factorial= factorial* i;
}

System.out.println("Factorial of"+num+"is:"+factorial);
	}

}
