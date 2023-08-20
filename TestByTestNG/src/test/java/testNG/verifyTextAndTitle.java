package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyTextAndTitle {
	
	@Test
	public void titletest()
	{
		SoftAssert softassert = new SoftAssert();
		String expectTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectText = "Search";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		String actualtitle = driver.getTitle();
		System.out.println("Verifying Title");
		softassert.assertEquals(actualtitle, expectTitle, "Title verification failed");
		
		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		System.out.println("Verifying Text");
		softassert.assertEquals(actualtext, expectText, "Text verification failed");
		
		System.out.println("Closing Browser");
		
		driver.close();
		softassert.assertAll();
	}


}
