package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printAllLinks {

	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.sugarcrm.com/");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links are:"+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			System.out.println("Links on page are:"+allLinks.get(i).getAttribute("href"));
			System.out.println("Links Text on page are:"+allLinks.get(i).getText());
		}

	}

}
