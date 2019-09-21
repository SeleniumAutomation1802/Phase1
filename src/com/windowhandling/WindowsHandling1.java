package com.windowhandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling1 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Capture the main window ID
		
		String mainWinId = driver.getWindowHandle();
		
		
		// Capture all windows ID
		
		Set<String> allWinIds = driver.getWindowHandles();
		
		for(String winId : allWinIds)
		{
			if(!(mainWinId.equals(winId)))
			{
				// Switching to child window
				driver.switchTo().window(winId);
				driver.close();
			}
		}
		
		// I am trying to work on main win with passing the control back to main Windows
		// Exception : NoSuchWindowException
		WebElement w1 = driver.findElement(By.xpath("//h2[text()='Best Places to Work']"));
		System.out.println(w1.getText());
		
		// Switching back to main window
		driver.switchTo().window(mainWinId);
		
		
		
		
		
		
		
	}
}
