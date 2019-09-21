package com.nbrown.demo.set1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jdwilliams.co.uk/");	
		
		WebElement searchTxtBox = driver.findElement(By.name("searchString"));
	
		searchTxtBox.sendKeys("Jeans");
		
		WebElement searchBtn = driver.findElement(By.xpath("//button[@id='searchButton']"));
		
		searchBtn.click();
		
		// Capture HTML source code for the current page
		String allPageSource = driver.getPageSource();
		
		if(allPageSource.contains("EH303"))
		{
			System.out.println("The Product is present");
		}
		else
		{
			System.out.println("The Product is not present");
		}
		
		WebElement plpProduct = driver.findElement(By.xpath("(//img[contains(@id,'imageProduct')])[1]"));
		
		plpProduct.click();
		
		// Capture the URL for the current page
		String url = driver.getCurrentUrl();
		
		String productId = "DJ115";
		if(url.contains(productId.toLowerCase()))
		{
			System.out.println("Product ID is present in the URL");
		}
		else
		{
			System.out.println("Product ID is not present in the URL");
		}
		
		// Navigate to other URL
		driver.navigate().to("https://www.simplybe.com/en-in/");
		
		String simplyBeurl = driver.getCurrentUrl();
		System.out.println(simplyBeurl);
		
		// Navigate back to previous Page
		driver.navigate().back();
		
		String JDWurl = driver.getCurrentUrl();
		System.out.println(JDWurl);
		
		// Navigate to next Page
		driver.navigate().forward();
		
		String simplyBeurl1 = driver.getCurrentUrl();
		System.out.println(simplyBeurl1);
		
		// Refresh the page
		driver.navigate().refresh();
		
		
		// It will close all the browser page which is open by webdriver
		driver.quit();
		
		
	}

}
