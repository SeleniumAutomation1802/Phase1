package com.pack1.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test2 
{
	@BeforeSuite(groups={"SmokeTest"})
	public void preCheck()
	{
		System.out.println("preCheck()");
	}
	
	@AfterSuite(groups={"SmokeTest"})
	public void postCheck()
	{
		System.out.println("postCheck()");
	}
	
	@Test(groups={"RegressionTest"})
	public void sampleFolderTest2()
	{
		System.out.println("sampleFolderTest2() of Test2");
	}
	
	@Test(groups={"RegressionTest"})
	public void deleteFolderTest2()
	{
		System.out.println("deleteFolderTest2() of Test2");
	}
	
	@Test
	public void shareFolderTest2()
	{
		System.out.println("shareFolderTest2() of Test2");
	}
	
	@Test(groups={"SmokeTest"})
	public void createFileTest2()
	{
		System.out.println("createFileTest2() of Test2");
	}
}
