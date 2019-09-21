package com.nbrown.actionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://www.jdwilliams.co.uk/");
		
		// Create the Actions class Object and Pass WebDriver reference variable in the constructor
		Actions act = new Actions(driver);

		WebElement newInWebElm = driver.findElement(By.id("topNav_NewIn"));
		act.moveToElement(newInWebElm).perform();
		
		
		
		
		
		
		
		
		
		WebElement homeWebElm = driver.findElement(By.id("DDM_pro__Home"));
		homeWebElm.click();
	}
	

}
