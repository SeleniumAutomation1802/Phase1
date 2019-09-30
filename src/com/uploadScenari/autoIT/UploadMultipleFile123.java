package com.uploadScenari.autoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadMultipleFile123 
{
	public String path = "C:\\Users\\pritamkx\\Desktop\\Automation2.0\\WeekEndBatch";
	@Test
	public void test1() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pritamkx/Desktop/HTMLWindows/uploadmultiplefile.html");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		WebElement uploadBtn= driver.findElement(By.cssSelector("input[name='img']"));
		uploadBtn.click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		String[] s1 = {"Test1.java", "Demo1.java", "Init.java", "Overloading1.java"};
		
		String fileNames = "";
		
		for(String s : s1)
		{
			fileNames = fileNames+"\""+s+"\""+" ";
		}
		
		System.out.println(fileNames);
		
//		uploadMultipleFile123(path, fileNames);
		
		
	}
	
	public void uploadMultipleFile123(String path, String fileNames) throws Exception
	{
		Runtime.getRuntime().exec("C:\\Pritam\\autoIT_UploadScenario\\MultiFileUpload\\Directory.exe"+" "+path);
		Thread.sleep(6000);
		Runtime.getRuntime().exec("C:\\Pritam\\autoIT_UploadScenario\\MultiFileUpload\\Directory.exe"+" "+fileNames);
	}
}
