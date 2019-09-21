package com.pack1.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass 
{
	@BeforeTest
	public void dbConnection()
	{
		System.out.println("dbConnection()");
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		System.out.println("Login to Google Drive");
	}
	
	@Test
	public void createFolderTest()
	{
		System.out.println("Folder created in GD");
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		System.out.println("Logout From Google Drive");
	}
	
	@AfterTest
	public void closeDbConnection()
	{
		System.out.println("closeDbConnection()");
	}
	
}
