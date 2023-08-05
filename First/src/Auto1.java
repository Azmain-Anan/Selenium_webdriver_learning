import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecho.driver", "C:\\Users\\Asus\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("https://www.aiub.edu/");
	}

}
