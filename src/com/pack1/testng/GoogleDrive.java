package com.pack1.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleDrive
{
	@BeforeTest
	public void dbConnection()
	{
		System.out.println("dbConnection()");
	}
	
	@AfterTest
	public void dbConnectionClose()
	{
		System.out.println("dbConnectionClose()");
	}
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("openBrowser()");
	}
	@BeforeMethod
	public void loginTOGoogleDrive()
	{
		System.out.println("loginTOGoogleDrive()");
	}
	
	@Test
	public void shareFolder()
	{
		System.out.println("Foder shared");
	}
	
	@AfterMethod
	public void logoutFronGoogleDrive()
	{
		System.out.println("logoutFronGoogleDrive()");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("closeBrowser()");
	}
}
