package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class reportersTest {
	
	@Test
	public void reporterstest1()
	{
		System.out.println("This is test 1");
	}
	
	@Test
	public void reporterstest2()
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
