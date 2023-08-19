package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class appLogIn {
	
	@BeforeTest
	public void loginToApp()
	{
		System.out.println("LogIn to Application");
	}
	
	@AfterTest
	public void logoutToApp()
	{
		System.out.println("LogOut from Application");
	}
	
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB connected");
	}
	
	@AfterMethod
	public void disconnectFromDB()
	{
		System.out.println("Disconnected from DB");
	}
	
    @Test(priority=1)
	public void aTest1()
	   
	{
		System.out.println("Test1");

	}
    
    @Test(priority=2)
    public void aTest2()
	   
	{
		System.out.println("Test2");

	}

}
