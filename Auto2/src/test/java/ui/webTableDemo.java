package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTableDemo {

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

		driver.get("https://tablepress.org/demo/");
		driver.manage().window().maximize();

		List<WebElement> row = driver
				.findElements(By.xpath("/html/body/div/main/div/div[1]/div/div[3]/div[2]/table/tbody/tr"));
		System.out.println(row.size());
		int rowsize = row.size();

		List<WebElement> column = driver
				.findElements(By.xpath("/html/body/div/main/div/div[1]/div/div[3]/div[2]/table/tbody/tr[1]/td"));
		System.out.println(column.size());
		int colsize = column.size();

		for (int i = 1; i <= rowsize; i++)
			for (int j = 1; j <= colsize; j++) {
				System.out.println(driver.findElement(By.xpath(
						"/html/body/div/main/div/div[1]/div/div[3]/div[2]/table/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText());
			}

	}

}
