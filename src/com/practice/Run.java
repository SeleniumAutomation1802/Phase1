package com.practice;

class A
{
	public static void m1()
	{
		System.out.println("M1 of A");
	}
}

class B extends A
{
	public static void m1()
	{
		System.out.println("M1 of B");
	}	
}


public class Run 
{
	public static void main(String[] args) {
		
		 A a1 =  new B();
		 a1.m1();
	}
}
