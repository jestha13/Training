package com.cubic.training.variables;


import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter a phrase with repeated words:");
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 =s.split(" ");
        
      // for(String s3:s1){// for display
        	//System.out.println(s3);
        	
        
        int b=0;
        int c = 0;
       
        for(int i=0;i<s1.length; i++ )
        {
        	for (int t =i+1;t<s1.length;t++)
        	{
        		if(s1[i].equalsIgnoreCase(s1[t]))
        		{
        			 
        			  
        			System.out.println("i:"+i+":"+s1[i]+"\n"+"t:"+t+":"+s1[t]);//checking the values of variable
        			 b=i;
        		}
        	}
        	
        }
        System.out.println("The repeated word is: "+s1[b]);
        for(int j = 0;j<s1.length;j++) {
        	if(s1[j].equalsIgnoreCase(s1[b])) {
        		c++;
        	}
        }
        System.out.println("Repeated count is " + c);
	}
	}


        
        
	
        
         
		
	

