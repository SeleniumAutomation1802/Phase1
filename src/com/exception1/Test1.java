package com.exception1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 
{
	public static void main(String[] args) 
	{
		m1();
		
		Test1 t1 = new Test1();
		t1=null;
	}
	
	static void m1()
	{
		System.out.println("M1");
		m2();
	}
	
	static void m2()
	{
		System.out.println("M2");
		m3();
	}
	
	static void m3()
	{
		System.out.println("M3");
		try{
			m4();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		
		finally
		{
			System.out.println("Close all the connection");
		}
	}
	
	static void m4()
	{
		System.out.println("M4");

		int a = 10;
		int b = 0;
		System.out.println(a/b);
		
		
	}
}
