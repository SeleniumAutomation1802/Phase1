package com.pack1.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Test4
{
	@Test
	public void loginToApp()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
}
