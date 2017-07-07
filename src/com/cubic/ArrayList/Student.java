package com.cubic.ArrayList;

public class Student {
	
	String name;
	int id;
	Double score;
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", score=" + score + "]";
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getScore() {
		return score;
	}


	public void setScore(Double score) {
		this.score = score;
	}

}
