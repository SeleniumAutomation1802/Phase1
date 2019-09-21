package com.nbrown.demo.set1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown1 
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/pritamkx/Desktop/multiselect1.html");
		
		WebElement mulSel = driver.findElement(By.xpath("//select[@name='Browsers']"));
		
		Select sel = new Select(mulSel);
		
		// Verify whether the drop down is multi select or single select
		boolean flag = sel.isMultiple();
		
		if(flag)
		{
			sel.selectByVisibleText("IE");
			sel.selectByValue("Chrome");
			sel.selectByIndex(4);
		}
		
		sel.deselectByVisibleText("Chrome");
		
		sel.deselectAll();
		
	}
}
