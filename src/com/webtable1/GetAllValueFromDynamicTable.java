package com.webtable1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllValueFromDynamicTable {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pritamkx/Desktop/HTMLWindows/table.html");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		List<WebElement> tableLst = driver.findElements(By.xpath("//table"));
		
		List<WebElement> rowLst = driver.findElements(By.xpath("//tr"));
		
		for(int i=0; i<rowLst.size(); i++)
		{
			List<WebElement> colList = rowLst.get(i).findElements(By.xpath("//tr["+i+"]/td"));
			for(int j=0; j<colList.size(); j++)
			{
				String value = colList.get(j).getText();
				System.out.print(value+"   :  ");
			}
			System.out.println();
			
			
		}
	}

}
