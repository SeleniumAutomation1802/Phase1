package com.listener1;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class Test2 
{
	@Test
	public void m1()
	{
		System.out.println("M1");
		Assert.assertTrue(true);
	}
	
	@Test
	public void m2()
	{
		System.out.println("M2");
		Assert.assertTrue(false);
	}
}
