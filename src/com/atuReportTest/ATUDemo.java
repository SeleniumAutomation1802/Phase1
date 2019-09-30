package com.atuReportTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.logging.LogAs;
import atu.testng.reports.utils.Utils;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class ATUDemo
{	
	{
		System.setProperty("atu.reporter.config", "C:\\Pritam\\GITWORKSPACE\\Phase1\\ATUProperties\\nbrown_atu.properties");
	}
	
	public WebDriver driver;
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jdwilliams.co.uk/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		setAuthorInfoForReports();
		
		
		
		WebElement w1 = driver.findElement(By.id("searchKeyWords2"));
		
		
		
		

	}
	
	@AfterMethod
	public void tearDone(ITestResult itr)
	{
		boolean flag = itr.isSuccess();
		if(flag)
		{
			ATUReports.add(itr.getMethod().getMethodName()+"_PASS", LogAs.PASSED, new CaptureScreen(
	                ScreenshotOf.DESKTOP));
		}
		else
		{
			ATUReports.add(itr.getMethod().getMethodName()+"_FAILED", LogAs.FAILED, new CaptureScreen(
	                 ScreenshotOf.DESKTOP));
		}
		
	}
	
	
	
	public void setAuthorInfoForReports(){
		ATUReports.setWebDriver(driver);
		ATUReports.setAuthorInfo("NBrown Automation Team", Utils.getCurrentTime(), "1.0");
	}
}
