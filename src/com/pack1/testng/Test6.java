package com.pack1.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test6 
{	
	@Test
	public void createFolder()
	{
		System.out.println("createFolder");
	}
	
	@Test(dependsOnMethods="createFolder")
	public void adeleteFolder()
	{
		System.out.println("deleteFolder");
	}
}