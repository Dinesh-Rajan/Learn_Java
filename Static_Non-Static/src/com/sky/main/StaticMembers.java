package com.sky.main;

public class StaticMembers {

	static int age = 23; // STATIC VARIABLE

	public static void age() { // STATIC METHOD
		System.out.println(" This is a static method");
	}

//	   How to call static members inside STATIC method
	public static void test1() {
		
		System.out.println("----------------INSIDE STATIC METHOD------------");

//		1---> Calling static members directly
		System.out.println(age);
		age();

//		2--> Calling static members using class name
		System.out.println(StaticMembers.age);
		StaticMembers.age();

//	    3--> Calling static members using object reference
		StaticMembers staticMembers = new StaticMembers();
		System.out.println(staticMembers.age);
		staticMembers.age();

	}

//    How to static members inside NON-STATIC method
	public void test() {
		
		System.out.println("--------------- INSIDE NON-STATIC METHOD-----------");

		
//	1---> Calling static members directly
		System.out.println(age);
		age();

//	2--> Calling static members using class name
		System.out.println(StaticMembers.age);
		StaticMembers.age();

//	3--> Calling static members using this Keyword
		System.out.println(this.age);
		this.age();
	}

	public static void main(String[] args) {
		test1();   // static
		StaticMembers members= new StaticMembers();
		members.test();   // Non-static

	}

}
