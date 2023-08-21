package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class annotationDemo {

	@BeforeClass
	public void beforeclass()

	{
		System.out.println("Test it before class");

	}

	@AfterClass
	public void afterclass()

	{
		System.out.println("Test it after class");

	}

	@BeforeGroups(value = "regression")
	public void beforegroup()

	{
		System.out.println("Test it before group");

	}

	@AfterGroups(value = "regression")
	public void aftergroup()

	{
		System.out.println("Test it before group");

	}

	

		@Test(priority = 1, groups = "regression")
		public void aTest1()

		{
			System.out.println("Test1");

		}

		@Test(priority = 2, groups = "regression")
		public void bTest1()

		{
			System.out.println("Test2");

		}

		@Test(groups = { "regression", "bvt" })
		public void bTest2()

		{
			System.out.println("Test3");

		}

		@Test(groups = "bvt")
		public void bTest3()

		{
			System.out.println("Test4");

		}

	}

