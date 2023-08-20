package testNG;

import org.testng.annotations.Test;

@Test(groups="use-groups")
public class groupDemoTest {
	
	@Test(priority=1,groups="regression")
	public void aTest1()
	   
	{
		System.out.println("Test1");

	}
	
	@Test(priority=2,groups="regression")
	public void bTest1()
	   
	{
		System.out.println("Test2");

	}
	
	@Test(groups={"regression","bvt"})
	public void bTest2()
	   
	{
		System.out.println("Test3");

	}
	
	@Test(groups="bvt")
	public void bTest3()
	   
	{
		System.out.println("Test4");

	}

}
