package com.fluentwait;

import java.util.concurrent.TimeUnit;import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample1 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Fluent Wait
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		WebElement expectedWebElm = wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver)
			{
				WebElement searchWebElm = driver.findElement(By.xpath("//a[text()='Search']"));
				return searchWebElm;
			}
		});
		
		String expectedVal = expectedWebElm.getText();
		
		if(expectedVal.equals("SEARCH"))
		{
			System.out.println("The expected web element is present: "+expectedVal);
			expectedWebElm.click();
		}
		else
		{
			System.out.println("The expected web element is not present");
		}
		
		
	}

}
