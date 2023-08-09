package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class workingWithWebElements {

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

		driver.get("https://portal.aiub.edu/");
		driver.manage().window().maximize();
		driver.findElement(By.name("UserName")).sendKeys("19-41287-3");
		driver.findElement(By.name("UserName")).clear();

		System.out.println(driver.findElement(By.name("UserName")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[4]/button"))
				.getCssValue("text-transform"));
		System.out.println(
				driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[4]/button")).getSize());
		System.out.println(
				driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[4]/button")).getLocation());
		System.out.println(
				driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[4]/button")).getText());
		System.out.println(
				driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[4]/button")).getTagName());
		System.out.println(
				driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[4]/button")).isDisplayed());
		System.out.println(
				driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[4]/button")).isEnabled());
		System.out.println(
				driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[4]/button")).isSelected());
		driver.close();

	}

}
