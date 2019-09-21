package com.testng.assert1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation
{
	@Parameters({"url", "username", "password"})
	@Test
	public void loginApp(String url, String username, String password)
	{
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
}
