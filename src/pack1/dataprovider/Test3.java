package pack1.dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3
{
	@Test(dataProvider="provider")
	public void loginToApp(String username, String password)
	{
		System.out.println(username+" , "+password);
	}
	
	@DataProvider(name="provider")
	public Object[][] getData(Method m)
	{
		Object[][] o1 = {{"AB", "01"}, {"BC", "02"}, {"CD", "03"}};
		return o1;
	}
}
