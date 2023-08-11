package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSuggesionDropdown {

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
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Sydney");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
	}

}
