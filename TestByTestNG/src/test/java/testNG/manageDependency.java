package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class manageDependency {

	@Test
	public void userRegistration()
	{
		System.out.println("This is test 1");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "userRegistration")
	public void userSearch()
	{
		Reporter.log("This is test 2s");
		System.out.println("This is test 2");
	}
	
	@Test
	public void reporterstest3()
	{
		System.out.println("This is test 3");
	}
	
	@Test
	public void reporterstest4()
	{
		System.out.println("This is test 4");
	}
	
}
