package com.testng.assert1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 
{
	@Test
	public void createFolder()
	{
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals("A", "B", "Both Value is not equal: ");
		
		sa.assertNotEquals("A", "B", "Both Value is not equal: ");
		
		sa.assertTrue(false, "We are not in PDP page");
		
		sa.assertAll();
	}
}
