package com.nbrown.demo.set1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleExpectedValueFromDropDown 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/pritamkx/Desktop/multiselect1.html");
		
		String[] expectedValues = {"FireFox", "Safari", "Opera"};
		
		WebElement browser = driver.findElement(By.name("Browsers"));
		
		Select sel = new Select(browser);
		
		List<WebElement> allOptions = sel.getOptions();
		
		boolean flag = sel.isMultiple();
		
		if(flag)
		{
			for(String value :  expectedValues)
			{
				Iterator<WebElement> itr = allOptions.iterator();
				while(itr.hasNext())
				{
					WebElement w = itr.next();
					String actualValue = w.getText();
					if(actualValue.equals(value))
					{
						sel.selectByVisibleText(value);
						break;
					}
				}
			}
		}
		
		// Verify whether the expected value is selected or not
		List<WebElement> allSelVal = sel.getAllSelectedOptions();
		
		for(WebElement w: allSelVal)
		{
			String actualValue = w.getText();
			
			for(String s : expectedValues)
			{
				if(actualValue.equals(s))
				{
					System.out.println("YES "+s);
				}
			}
		}
		WebElement w = sel.getFirstSelectedOption();
		System.out.println(w.getText());
		
		
	}

}
