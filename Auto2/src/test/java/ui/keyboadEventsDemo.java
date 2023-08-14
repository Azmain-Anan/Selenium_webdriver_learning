package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboadEventsDemo {

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

		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath(
				"/html/body/div[2]/div[3]/div/div[3]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[5]/pre/span"));
		Actions action = new Actions(driver);
		action.keyDown(source,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		WebElement destination = driver.findElement(By.xpath(
				"/html/body/div[2]/div[3]/div/div[4]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[8]/pre/span"));
		action.keyDown(destination,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		}

}
