package com.cubic.multithreading;

public class Teacher extends Student{
	String grade;
	public Teacher(int id, String name, double score, String grade){
		super(id,name,score);
		this.grade=grade;
	}
	private static final long serialVersionUI=-728729729l;
	@Override
	public String toString() {
		return "Teacher [grade=" + grade + ", id=" + id + ", name=" + name + ", score=" + score + "]";
	}

}
