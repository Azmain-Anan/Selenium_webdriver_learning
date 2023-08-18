package testNG;

import org.testng.annotations.Test;

public class logInTest {
	
	@Test(priority=1)
	public void loginTest()
   
	{
		System.out.println("Successfully LogIn");

	}
	
	@Test(priority=2)
	public void logoutTest()
	   
	{
		System.out.println("Successfully LogOut");

	}

}
