package com.cubic.training.heirrachy;

public class CreateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Emp E = new Emp("surendra", 75000, new Address1(),new Employer());
        E.display();
	}

}
