package com.nbrown.demo.set1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProduct 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Set The chrome browser server
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		
		// Open Empty Browser
		WebDriver driver = new ChromeDriver();
		
		// Pass url in Browser
		driver.get("https://www.jdwilliams.co.uk/");	
		
		// Identify the webElement in the browser
		WebElement searchTxtBox = driver.findElement(By.name("searchString"));
	
		// Perform the action on Search Text Box
		searchTxtBox.sendKeys("Jeans");
		
		WebElement searchBtn = driver.findElement(By.xpath("//button[@id='searchButton']"));
		
		searchBtn.click();
		
		// Verification ---> 1
		List<WebElement> lst = driver.findElements(By.xpath("//img[contains(@id,'imageProduct')]"));
		
		if(lst.size()>0)
		{
			System.out.println("We are in PLP page");
		}
		else
		{
			System.out.println("We not in PLP page");
		}
		
		// Verification ---> 2
		
		WebElement pdtPerPageWebElm = driver.findElement(By.xpath("(//p[text()='Products Per Page:'])[1]"));
		
		String actualPLPText = pdtPerPageWebElm.getText();
		
		if(actualPLPText.equals("PRODUCTS PER PAGE:"))
		{
			System.out.println("We are in PLP page "+actualPLPText);
		}
		else
		{
			System.out.println("We are not in PLP page "+actualPLPText);
		}
		
		WebElement black = driver.findElement(By.xpath("(//a[contains(@id,'Black')])[2]"));
		
		black.click();
		
		Thread.sleep(7000);
		
		List<WebElement> lst1 = driver.findElements(By.xpath("//img[contains(@id,'imageProduct')]"));
		
		for(WebElement w1 : lst1)
		{
			String color = w1.getCssValue("color");
			System.out.println(color);
			if(color.equals("rgba(0, 0, 0, 1)"))
			{
				System.out.println("Jeans is in black color");
			}
			else
			{
				System.out.println("Jeans is not in black color");
			}
		}
		
//		WebElement pdpImg = driver.findElement(By.xpath("(//img[contains(@id,'imageProduct')])[1]"));
		
//		pdpImg.click();
		
		// Close the browser
//		driver.close();
		
	}
}
