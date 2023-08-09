package ui;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicWebdriverMethod {

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

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String pagesource= driver.getPageSource();
		System.out.println(pagesource);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
		System.out.println(elements);
		
		driver.navigate().to("https://www.bdjobs.com/");
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div/ul/li[5]/a/span/span")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		driver.quit();
	}

}
