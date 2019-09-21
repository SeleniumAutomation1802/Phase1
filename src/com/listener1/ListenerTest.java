package com.listener1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getMethod().getMethodName()+" Test cases is started: ");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(result.getMethod().getMethodName()+"  Test cases is "+getSatus(result));
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getMethod().getMethodName()+"  Test cases is  "+getSatus(result));
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log(result.getMethod().getMethodName()+"  Test cases is  "+getSatus(result));
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println(result.getMethod().getMethodName()+"  Test cases is FAILED within success percentage: ");
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println(context.getName()+" Test case is getting start: ");
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println(context.getName()+" Test case is getting Finish: ");
	}
	
	public String getSatus(ITestResult itr)
	{
		int val = itr.getStatus();
		
		switch(val)
		{
			case 1:
				return "PASS";
			case 2:
				return "FAIL";
			case 3:
				return "SKIP";
		}
		return "Invalid Status";
	}

}
