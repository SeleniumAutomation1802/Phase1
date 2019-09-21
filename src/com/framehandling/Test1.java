package com.framehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://www.jdwilliams.com/en-in/join");
		Thread.sleep(4000);
		WebElement w1 = driver.findElement(By.xpath("//label[@for='firstName']"));
	
		String s1 = w1.getCssValue("box-sizing");
		
		System.out.println("STAR: "+s1);
	
	}
}
