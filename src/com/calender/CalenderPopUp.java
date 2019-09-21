package com.calender;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class CalenderPopUp {

	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Fluent Wait 
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		
		WebElement w1 = wait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver)
			{
				WebElement w2 = driver.findElement(By.xpath("//a[text()='Search']"));
				if(w2.getText().equals("SEARCH"))
				{
					return w2;
				}
				else
				{
					return null;
				}
				
			}
			
		});
		System.out.println(w1.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement depart = driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"));
//		
//		depart.click();
//		
//		datePicker("December 2019", "10");
	}
	
	public static void datePicker(String yearAndMonth, String day) throws InterruptedException
	{
		for(int i=1; i<=6; i++)
		{
			try
			{
				WebElement date = driver.findElement(By.xpath("(//div[text()='"+yearAndMonth+"']//following::p[text()='"+day+"'])[1]"));
				date.click();
				break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				Thread.sleep(2000);
			}
		}
		
	}

}
