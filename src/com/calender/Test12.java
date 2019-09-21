package com.calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test12 extends Thread
{
	WebDriver driver = UnExpectedpopUp.driver;
	public void run()
	{
		while(true)
		{
			try 
			{
				WebElement closePopUP = driver.findElement(By.xpath("//div[@id='close']"));
				closePopUP.click();
				break;
			
			} 
			catch (Exception e) 
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1)
				{
					e1.printStackTrace();
				}
			}
		}
	}
	
}
