package com.nbrown.actionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement source = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
//		Point p = destination.getLocation();
//		
//		int xAxis = p.x;
//		int yAxis = p.y;
		
		Actions act = new Actions(driver);
		
		// Drag and Drop
//		act.dragAndDrop(source, destination).perform();
		
		Action act1 = act.clickAndHold(source).moveToElement(destination).release(destination).build();
		act1.perform();
		
		
		
		
		
		
		
		
		
	}

}
