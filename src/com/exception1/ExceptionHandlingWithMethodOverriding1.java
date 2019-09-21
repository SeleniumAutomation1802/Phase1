package com.exception1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Parent
{
	void m1()  throws ArithmeticException
	{
		System.out.println("m1 of Parent");
		int a = 10;
		int b = 0;
		System.out.println(a/b);
	}
}

class Child extends Parent
{
	void m1() throws ArithmeticException
	{ 
		System.out.println("M1 of Child: ");
		
	}
}





public class ExceptionHandlingWithMethodOverriding1
{
	public static void main(String[] args) {
		
		Parent p1 = new Child();
		p1.m1();
	}
}
