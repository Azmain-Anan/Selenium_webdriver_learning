package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptExecutor {

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

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		JavascriptExecutor jsexe = (JavascriptExecutor) driver;
		//print the title
		String script = "return document.title;";
		String title = (String) jsexe.executeScript(script);
		System.out.println(title);
		
		//click button
		driver.switchTo().frame("iframeResult");
		jsexe.executeScript("myFunction();");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//highlight button
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jsexe.executeScript("arguments[0].style.border='5px solid red'", button);
		Thread.sleep(2000);
		
		//scroll
		driver.navigate().to("https://www.w3schools.com/");
		WebElement gamebutton = driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[14]/div/p/a"));
		jsexe.executeScript("arguments[0].scrollIntoView(true);", gamebutton);
		
		

	}

}
