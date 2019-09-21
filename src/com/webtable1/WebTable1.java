package com.webtable1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pritamkx/Desktop/HTMLWindows/table.html");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
//		WebElement w1 = driver.findElement(By.xpath("//*[contains(text(),'UCO Bank')]"));
//		
//		System.out.println(w1.getText());
		
		// Count the row in dynamic table
		List<WebElement> row_count = driver.findElements(By.xpath("//table/tbody/tr"));
		
		System.out.println("Total row in Table: "+row_count.size());
		
		// Count the Column in dynamic table
		List<WebElement> col_count = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		
		System.out.println("Total Column in Table: "+col_count.size());
		
		
		// Fetch the particular value from cell.
		WebElement col_Value = driver.findElement(By.xpath("//table/tbody/tr[10]/td[5]"));
		
		System.out.println(col_Value.getText());
	}

}
