package com.sky.main;

import java.lang.reflect.Member;

public class NonStaticMem {

	int age = 22; // NON-STATIC VARIABLE

	public void age() { // NON-STATIC MTD
		System.out.println("This is a non static method");
	}

//	Calling NON-static members inside STATIC method
	public static void test1() {

		System.out.println("----------------INSIDE STATIC METHOD------------");
		
//		Calling non static mem using object reference
		NonStaticMem mem = new NonStaticMem();
		System.out.println(mem.age);
		mem.age();
	}

//	Calling NON-static members inside NON-STATIC method
	public void test() {

		System.out.println("--------------- INSIDE NON-STATIC METHOD-----------");

//		1---> Calling non static members Directly
		System.out.println(age);
		age();
		
//		2--> Calling non static memnbers using THIS keyword
		System.out.println(this.age);
		this.age();
		
//		3--> Calling non static members using Object Reference
		NonStaticMem mem = new NonStaticMem();
		System.out.println(mem.age);
		mem.age();
	}

	public static void main(String[] args) {
		NonStaticMem mem = new NonStaticMem();
		mem.test();  //non static
		test1();     //static
		

	}

}
