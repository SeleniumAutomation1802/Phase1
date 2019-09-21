package com.windowhandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement searchJobWebElm = driver.findElement(By.xpath("(//a[@title='Search Jobs'])[1]"));
		searchJobWebElm.click();
		
		String expectedTitle = " Browse Jobs by Company, Location, Skills, Designation & Industry - Naukri.com ";
		
		// Capture the main window id

		String mainWinId = driver.getWindowHandle();
		
		// Capture all windows IDs
		
		Set<String> allWinIds= driver.getWindowHandles();
		
		for(String winId : allWinIds)
		{
			driver.switchTo().window(winId);
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(expectedTitle))
			{
				driver.findElement(By.xpath("(//a[@title='All Jobs'])[1]")).click();
				driver.close();
			}
		}
		driver.switchTo().window(mainWinId);
		
	}

}
