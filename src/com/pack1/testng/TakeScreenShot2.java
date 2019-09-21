package com.pack1.testng;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TakeScreenShot2
{
	public WebDriver driver = null;
	@Test
	public void loginToApp() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		driver = new ChromeDriver();
		Dimension d =new Dimension(420,600);
		driver.manage().window().setSize(d);
		//driver.manage().window().maximize();
		driver.get("https://www.jdwilliams.com/en-in/");
		driver.manage().timeouts().implicitlyWait(Constant.syncTime, TimeUnit.SECONDS);
		captureScreenShot("HomePage");
		driver.findElement(By.id("searchString1")).sendKeys("Jeans");
		driver.findElement(By.id("searchBoxSubmitBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Constant.syncTime);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class,'product-list-grid-btn  active')]")));
		captureScreenShot("PLP");
	}
	
	public void captureScreenShot(String screenShotName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceScreenShot = ts.getScreenshotAs(OutputType.FILE);
		File destFld = new File("C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\ScreenShotFolder\\"+screenShotName+".jpg");
		FileHandler.copy(sourceScreenShot, destFld);
	}
}
