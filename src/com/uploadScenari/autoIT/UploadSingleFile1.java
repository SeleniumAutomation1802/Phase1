package com.uploadScenari.autoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadSingleFile1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pritamkx/Desktop/HTMLWindows/upload.html");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		WebElement uploadBtn= driver.findElement(By.xpath("//input[@name='file']"));
		uploadBtn.click();
		Thread.sleep(3000);
		
		
		fileUpload("C:\\Users\\pritamkx\\Desktop\\Automation2.0\\WeekEndBatch\\Test1.java");
		
	}
	
	public static void fileUpload(String fileName)
	{
		try
		{
			Thread.sleep(3000);
			Runtime.getRuntime().exec("C:\\Pritam\\autoIT_UploadScenario\\uploadMultiPleFile.exe"+" "+fileName);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}

}
