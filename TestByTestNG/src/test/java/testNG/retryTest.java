package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.baseTest;

public class retryTest extends baseTest{
	
	@Test(retryAnalyzer = common.retryDemo.class)
	public void launchApp()
	{
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(false);
	}

}
