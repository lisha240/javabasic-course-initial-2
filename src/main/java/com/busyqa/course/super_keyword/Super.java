package com.busyqa.course.super_keyword;

class Parent {

	String color = "parent color";
	
	public Parent() {
		super();
		System.out.println("Parent Contructor");
	}

	void doSomething() {
		System.out.println("Parent Doing Something");
	}
}

class Child extends Parent{

    String color = "child color";
		
    public Child() {

    	System.out.println("Child Contructor"); 
    }

	void displayColor() {
    	System.out.println(this.color);

    }
    
	@Override
	void doSomething() {
		System.out.println("Child Doing Something");
		
	}
}

public class Super {
	
	public static void main(String[] args) {
		Child child = new Child();
		
		child.displayColor();
		child.doSomething();
	}
}
