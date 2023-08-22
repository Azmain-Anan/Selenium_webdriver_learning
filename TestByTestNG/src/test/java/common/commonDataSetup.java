package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class commonDataSetup {
	
	@BeforeSuite
	public void datasetup()
	{
		System.out.println("Common data setup");
	}
	
	@AfterSuite
	public void datateardown()
	{
		System.out.println("Common data clean ");
	}

}
