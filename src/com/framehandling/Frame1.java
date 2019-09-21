package com.framehandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.get("https://drive.google.com/drive/my-drive");
		
		List<WebElement> lst = driver.findElements(By.xpath("(//a[text()='Go to Google Drive'])[2]"));
		
		if(lst.size()>=1)
		{
			System.out.println("WebElement is present");
			lst.get(0).click();
		}
		else
		{
			System.out.println("WebElement is not present");
		}
		
		Thread.sleep(5000);
		
		WebElement emailWebElm = driver.findElement(By.xpath("//input[@id='identifierId']"));
		emailWebElm.sendKeys("seleniumautomation1802");
		
		WebElement next1 = driver.findElement(By.xpath("//span[text()='Next']"));
		next1.click();
		
		Thread.sleep(5000);
		
		WebElement pswTxtBox = driver.findElement(By.name("password"));
		pswTxtBox.sendKeys("Abcd@123");
		
		WebElement next2 = driver.findElement(By.xpath("//span[text()='Next']"));
		next2.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[text()='New'])[1]")));
		
		List<WebElement> allSampleFld = driver.findElements(By.xpath("(//div[text()='SampleFolder'])[1]"));
		
		if(allSampleFld.size()>0)
		{
			for(int i=0; i<allSampleFld.size(); i++)
			{
				WebElement w1 = allSampleFld.get(i);
				w1.click();
				driver.findElement(By.xpath("(//div[@aria-label='Remove'])[1]")).click();
				Thread.sleep(1000);
			}
			// Create the folder
		}
		else
		{
			System.out.println("Folder is not present: ");
			// Create the folder
		}
		
		WebElement newWebElm =  driver.findElement(By.xpath("(//div[text()='New'])[1]"));
		Actions act = new Actions(driver);
		act.click(newWebElm).perform();
		Thread.sleep(3000);
		
		WebElement fldWebElm  = driver.findElement(By.xpath("(//div[text()='Folder'])[1]"));
		act.click(fldWebElm).perform();
		Thread.sleep(2000);
		
	
		act.sendKeys("SampleFolder").perform();
		
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		WebElement sampleFld = driver.findElement(By.xpath("(//div[text()='SampleFolder'])[1]"));
		String actualVal = sampleFld.getText();
		if(actualVal.equals("SampleFolder"))
		{
			System.out.println("Folder is created sucessfully");
			sampleFld.click();
			WebElement shareBtn = driver.findElement(By.xpath("((//div[@aria-label='Remove'])[1]/preceding-sibling::div/div)[2]"));
			shareBtn.click();
			Thread.sleep(5000);
			
			WebElement frameWebElm = driver.findElement(By.xpath("//iframe[@title='Share with others']"));
			
			// Switching to frame
			driver.switchTo().frame(frameWebElm);
			
			WebElement advWebElm = driver.findElement(By.xpath("//span[text()='Advanced']"));
			advWebElm.click();
		}
		else
		{
			System.out.println("Folder is not created");
		}
		
		
		
		
		
	}

}
