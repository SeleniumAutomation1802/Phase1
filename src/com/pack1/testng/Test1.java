package com.pack1.testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Test1
{
	@BeforeGroups(groups={"SmokeTest"})
	public void beforeGroupTest()
	{
		System.out.println("beforeGroupTest() of Test1");
	}
	@AfterGroups(groups={"SmokeTest"})
	public void afterGroupTest()
	{
		System.out.println("afterGroupTest() of Test1");
	}
	
	@Test(groups={"SmokeTest","RegressionTest"})
	public void sampleFolder()
	{
		System.out.println("sampleFolder() of Test1");
	}
	
	@Test(groups={"RegressionTest"})
	public void deleteFolder()
	{
		System.out.println("deleteFolder() of Test1");
	}
	
	@Test(groups={"SmokeTest"})
	public void shareFolder()
	{
		System.out.println("shareFolder() of Test1");
	}
	
	@Test(groups={"RegressionTest"})
	public void downloadFolder()
	{
		System.out.println("downloadFolder() of Test1");
	}
	
	@Test
	public void downloadFile()
	{
		System.out.println("downloadFile() of Test1");
	}
	
	@Test
	public void createPPT()
	{
		System.out.println("createPPT() of Test1");
	}
}
