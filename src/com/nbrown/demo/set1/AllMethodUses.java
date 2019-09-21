package com.nbrown.demo.set1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethodUses {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jdwilliams.co.uk/");
		
		// How to capture the title at Run time
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		WebElement searchTxtBox = driver.findElement(By.name("searchString"));
		// Identify whether the seach text box is display or nor
		boolean flag1 = searchTxtBox.isDisplayed();
		
		if(flag1)
		{
			System.out.println("Search text box is present in the Web page");
		}
		else
		{
			System.out.println("Search text box is not present in the Web page");
		}
		
		// Identify whether the seach text box is enabled or nor
		
		boolean flag2 = searchTxtBox.isEnabled();
		
		if(flag2)
		{
			System.out.println("Search text box is Enabled");
		}
		else
		{
			System.out.println("Search text box is not Enabled");
		}
		
		// It will capture the backend attribute value
		String placeholderText = searchTxtBox.getAttribute("placeholder");
		
		System.out.println(placeholderText);
		
		// It will capture the Style of the web element like color
		String color = searchTxtBox.getCssValue("color");
		
		// It will capture the Location(X axis and Y axis) of the web element
		Point p = searchTxtBox.getLocation();
		System.out.println("X Axis = "+p.x);
		System.out.println("Y Axis = "+p.y);
		
		// It will capture the Dimension(Hight and Width) of the web element
		Dimension d = searchTxtBox.getSize();
		System.out.println("Hight: "+d.height);
		System.out.println("Width: "+d.width);
		
		String tagName = searchTxtBox.getTagName();
		System.out.println(tagName);
		
		
		
	
	}

}
