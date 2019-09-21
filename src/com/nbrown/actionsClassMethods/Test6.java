package com.nbrown.actionsClassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://drive.google.com");
		
		List<WebElement> lst = driver.findElements(By.xpath("(//a[text()='Go to Google Drive'])[2]"));
		
		if(lst.size()>=1)
		{
			System.out.println("WebElement is present");
			lst.get(0).click();
		}
		else
		{
			System.out.println("WebElement is not present");
		}
		
		WebElement emailWebElm = driver.findElement(By.xpath("//input[@id='identifierId']"));
		emailWebElm.sendKeys("seleniumautomation1802");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
	}

}
