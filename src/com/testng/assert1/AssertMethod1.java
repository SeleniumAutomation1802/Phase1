package com.testng.assert1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertMethod1 
{
	public String toString()
	{
		return "Hello";
	}
	
	@Test
	public void searchProduct()
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.jdwilliams.com/en-in/?cm_sp=JDW-Header-_-India-_-India&decoration=true");
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		
//		String expectedTitle = "JD Williams";
//		
//		String actualTitle = "JD Williams";
//		
//		Assert.assertSame(actualTitle, expectedTitle, "Both title are not equal"); // PASS
//		
//		
//		
//		AssertMethod1 a1 = new AssertMethod1();
//		AssertMethod1 a2 = new AssertMethod1();
//		
//		Assert.assertSame(a1, a2, "Both object are not equal"); // FAIL both object are refering to different Object
		
		
		
//		Assert.assertNotEquals(actualTitle, expectedTitle, "We are not in Home Page");
		
//		String[] expectedVal = {"java", "selenium"};
//		
//		String[] actualVal = {"java", "selenium"};
//		
//		Assert.assertNotEquals(actualVal, expectedVal, "Both are equal"); // FAIL with message
		
		
		
		
		
		
//		String s3 = null;
//		
//		Assert.assertNull(s3, "The Object are not null"); // PASS because object are null
		
		String s4 = "Pritam";
		
		Assert.assertNotNull(s4, "The Object are not null"); // PASS because object are not null
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
