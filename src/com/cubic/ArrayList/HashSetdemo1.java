package com.cubic.ArrayList;

import java.util.HashSet;

public class HashSetdemo1 {//treeset sort ,linkedhasset maintains insertion order

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("java");
		hs.add("program");
		hs.add("java");
		
		for(String s: hs){
			System.out.println(s);
		}

	}

}
