package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sliderDemo {

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

		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/iframe"));
		driver.switchTo().frame(frame);

		WebElement slider = driver.findElement(By.xpath("/html/body/div/span"));

		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 100, 120).perform();

	}

}
