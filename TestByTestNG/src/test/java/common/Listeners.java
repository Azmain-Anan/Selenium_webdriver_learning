package common;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		Reporter.log("Method name is -" +result.getName());
		System.out.println("Test is starting");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("Status of execution is -" +result.getStatus());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test failed - screenshot taken");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	
	public void onStart(ITestContext context)
	{
		
	}
	
	public void onFinish(ITestContext context)
	{
		
	}


}
