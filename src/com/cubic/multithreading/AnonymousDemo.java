package com.cubic.multithreading;

public class AnonymousDemo {
	public AnonymousDemo(){//constructor is called when object is made and method is executed.
		display1(); 
	}
	void display(){
		System.out.println("parent method");
	}
	
	void display1(){
		System.out.println("Call method in constructor");
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnonymousDemo ad =new AnonymousDemo(){//create object of Anoy.demo a
			void display(){
				System.out.println("Anonymous demo");
			}
			
			
		};
	ad.display();	
    Demo c = new Demo();
    c.display();
    
	}

}
class Demo{
	void display(){
		System.out.println(" demo");
	}
}
