package pack1.dataprovider;

import org.testng.annotations.Test;

public class Test2
{
	@Test(dataProvider="provider", dataProviderClass=Test1.class)
	public void loginToApp(String username, String password)
	{
		System.out.println(username+" , "+password);
	}
	
	@Test(dataProvider="provider", dataProviderClass=Test1.class)
	public void createFolder(String folderName)
	{
		System.out.println(folderName);
	}
}
