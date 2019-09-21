package com.pack1.screenshot1;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.pack1.testng.Constant;

public class Screenshot1 
{
	public WebDriver driver = null;
	@Test
	public void m1() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		driver = new ChromeDriver();
//		Dimension d =new Dimension(420,600);
//		driver.manage().window().setSize(d);
		driver.manage().window().maximize();
		driver.get("https://www.jdwilliams.com/en-in/");
		driver.manage().timeouts().implicitlyWait(Constant.syncTime, TimeUnit.SECONDS);
		Assert.assertTrue(false, "In Home Page");
		
	}
	
	@Test
	public void m2()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		driver = new ChromeDriver();
//		Dimension d =new Dimension(420,600);
//		driver.manage().window().setSize(d);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Constant.syncTime, TimeUnit.SECONDS);
		Assert.assertTrue(true, "Not In Home Page");
	}
	
//	@AfterMethod
//	public void tearDown(ITestResult itr) throws IOException
//	{
//		String status = getStatus(itr);
//		if(status.equals("Pass"))
//		{
//			captureScreenShot(itr.getMethod().getMethodName());
//		}
//		if(status.equals("Fail"))
//		{
//			captureScreenShot(itr.getMethod().getMethodName());
//		}
//		if(status.equals("Skipped"))
//		{
//			captureScreenShot(itr.getMethod().getMethodName());
//		}
//		
//	}
	
	@AfterMethod
	public void tearDown(ITestResult itr) throws IOException
	{
		boolean flag = itr.isSuccess();
		
		if(flag)
		{
			captureScreenShot(itr.getMethod().getMethodName());
		}
		else
		{
			captureScreenShot(itr.getMethod().getMethodName());
		}
	}
	
	@AfterMethod
	public void tearDown1(ITestResult itr) throws IOException
	{	
		if(itr.SUCCESS==1)
		{
			captureScreenShot(itr.getMethod().getMethodName());
		}
		else if(itr.FAILURE==2)
		{
			captureScreenShot(itr.getMethod().getMethodName());
		}
		else if(itr.SKIP==3)
		{
			captureScreenShot(itr.getMethod().getMethodName());
		}
	}
	
	public String getStatus(ITestResult itr)
	{
		int statusVal = itr.getStatus();
		
		switch(statusVal)
		{
			case 1:
				return "Pass";
			case 2:
				return "Fail";
			case 3:
				return "Skipped";
		}
		return "Not Completed";
	}
	
	public void captureScreenShot(String screenShotName) throws IOException
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File sourceScreenShot = ts.getScreenshotAs(OutputType.FILE);
			File destFld = new File("C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\ScreenShotFolder\\"+screenShotName+".jpg");
			FileHandler.copy(sourceScreenShot, destFld);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}