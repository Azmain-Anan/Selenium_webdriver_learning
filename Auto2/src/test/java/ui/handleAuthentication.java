package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

  


public class handleAuthentication {
	public static String name = "admin";
	public static String pass = "admin";

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://"+ name +":"+ pass +"@the-internet.herokuapp.com/basic_auth");

	}

}
