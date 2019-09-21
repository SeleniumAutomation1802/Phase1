package com.pack1.testng;

import org.testng.annotations.Test;

public class Test5
{
	@Test(priority=4)
	public void shareFolderTest()
	{
		System.out.println("shareFolderTest : ");
	}
	
	@Test(priority=2)
	public void createFolderTest()
	{
		System.out.println("Folder created: ");
	}
	
	@Test(priority=1)
	public void deleteFolderTest()
	{
		System.out.println("deleteFolderTest : ");
	}
	
	@Test(priority=3)
	public void renameFile()
	{
		System.out.println("renameFile");
	}
	
	@Test
	public void renameFolder()
	{
		System.out.println("renameFolder");
	}
	@Test
	public void downloadFileTest()
	{
		System.out.println("downloadFileTest : ");
	}

	
}
