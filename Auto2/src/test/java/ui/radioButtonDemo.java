package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radioButtonDemo {

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

		driver.get("https://materializecss.com/radio-buttons.html");
		driver.manage().window().maximize();
		
		WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"radio\"]/form/p[1]/label/span"));
		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"radio\"]/form/p[2]/label/span"));
		radio2.click();
		System.out.println(radio1.isSelected());
		System.out.println(radio2.isSelected());
	}

}
