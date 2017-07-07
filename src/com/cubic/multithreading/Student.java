package com.cubic.multithreading;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{


int id;
String name;
Double score;

public Student(int id, String name, Double score) {	
	this.id = id;
	this.name = name;
	this.score = score;
	
	
}

}
