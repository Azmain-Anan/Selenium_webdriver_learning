package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxDemo {

	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
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

		driver.get("http://total-qa.com/checkbox-example/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"post-3261\"]/div/p/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"post-3261\"]/div/p/input[1]")).click();
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
