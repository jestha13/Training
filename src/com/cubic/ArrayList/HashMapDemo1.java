package com.cubic.ArrayList;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {//ascending order of key
	//HashMap<Integer,String> hm=new HashMap<>();

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		// TODO Auto-generated method stub
		hm.put(101, "java");
		hm.put(102,"language");
		hm.put(99, "the");
		
		for(Map.Entry m: hm.entrySet()){
			System.out.println(m.getKey() +" "+ m.getValue() );
		}
		

	}

}
