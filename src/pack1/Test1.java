package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Test1 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		EventFiringWebDriver e = new EventFiringWebDriver(driver);
		EventHandler eh = new EventHandler();
		e.register(eh);
		e.get("file:///C:/Users/pritamkx/Desktop/HTMLWindows/upload.html");
		e.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		e.findElement(By.xpath("//input[@name='file']")).click();
		
	}

}
