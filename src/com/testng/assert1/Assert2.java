package com.testng.assert1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert2
{
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jdwilliams.com/en-in/?cm_sp=JDW-Header-_-India-_-India&decoration=true");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement searchTxtBox = driver.findElement(By.xpath("//input[@id='searchString1']"));
		
		String s1 = searchTxtBox.getAttribute("placeholder");
		
		boolean flag = s1.equals("SEARCH");
		
		Assert.assertTrue(flag, "We are not in Search pages");
		
		
		List<WebElement> lst = driver.findElements(By.xpath("//input[@id='searchString1']"));
		
		Assert.assertTrue(lst.size()>0, "We are not in Search page");
		
		
		
		
//		String actualTitle = driver.getTitle();
//		
//		Assert.assertFalse(actualTitle.contains("JD Williams"), "We are not in home page"); // FAIL
	}
}
