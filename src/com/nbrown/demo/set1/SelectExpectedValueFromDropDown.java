package com.nbrown.demo.set1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExpectedValueFromDropDown
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String expectedValue = "Nov";
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		Select sel = new Select(month);
		
		List<WebElement> allDropDownVal = sel.getOptions();
		
		// Method -- 1: Normal For loop
		int len = allDropDownVal.size();
		for(int i=0; i<=len-1; i++)
		{
			WebElement w1 = allDropDownVal.get(i);
			String actualVal = w1.getText();
			if(actualVal.equals(expectedValue))
			{
				sel.selectByVisibleText(expectedValue);
			}
		}
		
		// Method -- 2 : For Each Loop
		for(WebElement w : allDropDownVal)
		{
			String actualVal = w.getText();
			if(actualVal.equals(expectedValue))
			{
				sel.selectByVisibleText(expectedValue);
			}
		}
		
		// Method -- 3 : Iterator
		
		Iterator<WebElement> itr = allDropDownVal.iterator();
		
		while(itr.hasNext())
		{
			WebElement w = itr.next();
			String actualVal = w.getText();
			if(actualVal.equals(expectedValue))
			{
				sel.selectByVisibleText(expectedValue);
			}
		}
		
		
		
		
		
	}
}
