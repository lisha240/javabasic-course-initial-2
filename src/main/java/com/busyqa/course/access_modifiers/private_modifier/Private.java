package com.busyqa.course.access_modifiers.private_modifier;

@SuppressWarnings("unused")
class ClassA {

	/* 
	 * private members can only be accessible from within their own class;
	 * private access modifier cannot be used on a class
	 */ 
	private int member;
	
	private void doSomething() {
		System.out.println("Doing Something");
	}
}

@SuppressWarnings("unused")
class ClassB {	

}
public class Private {

	
}
