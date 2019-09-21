package com.nbrown.demo.set1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect 
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement dayWebElm =  driver.findElement(By.name("birthday_day"));
		
		Select sel = new Select(dayWebElm);
		sel.selectByVisibleText("15");
		sel.selectByVisibleText("30");
		sel.selectByValue("17");
		
		sel.selectByIndex(3);
	}
}
