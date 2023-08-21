package testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipDemo {
	
	boolean datasetup = true;
	
	@Test(enabled=false)
	public void skipTest1()
	{
		System.out.println("Skipping the test case as it is not complete ");
	}
	
	@Test
	public void skipTest2()
	{
		System.out.println("Skipping the test case forcefully ");
		throw new SkipException ("Skip the test");
	}
	
	@Test
	public void skipTest3()
	{
		System.out.println("Skipping the test case as per condition ");
		
		if(datasetup==true)
		{
			System.out.println("Execute the test");
		}
		else
		{
			System.out.println("Do not execute the tset");
			throw new SkipException ("Do not execute the tset");
		}
	}

}
