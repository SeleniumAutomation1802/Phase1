package pack1.desiredcapabilities1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void m1()
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		DesiredCapabilities cap =  new DesiredCapabilities();
		cap.setCapability("ignoreProtectedModeSettings", true);
		cap.setCapability("ignoreZoomSetting", true);
		cap.setCapability("disable-popup-blocking", true);
		cap.setCapability("nativeEvents", false);
		cap.setCapability("unexpectedAlertBehaviour", "accept");
//		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
//		
		cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
		String c1= CapabilityType.BROWSER_VERSION;
		System.out.println(c1);
		
		System.setProperty("webdriver.ie.driver", "C:\\Pritam\\EclipseWorkspace\\SeleniumBasic_1\\Server\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(cap);
//		driver.get("https://cacert.org/");
//		driver.get("javascript:document.getElementById('overridelink').click();");
		
		
	}
}