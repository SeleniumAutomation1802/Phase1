package com.alert12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertWindows1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement loginBtnWebElm = driver.findElement(By.id("loginbutton"));
		loginBtnWebElm.click();
		
		Thread.sleep(3000);
		
		try
		{
			// Switch to alert window
			Alert alt = driver.switchTo().alert();
			// Capture the alert text
			String actualText = alt.getText();
			if(actualText.equals("Enter User ID"))
			{
				//Click on Ok Button
				alt.accept();
			}
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		WebElement frameWebElm = driver.findElement(By.xpath("//iframe[@title='Sharing settings']"));
		
		
	}

}
