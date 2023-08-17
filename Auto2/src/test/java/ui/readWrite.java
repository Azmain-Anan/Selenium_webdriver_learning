package ui;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class readWrite {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileInputStream input = new FileInputStream("C:\\Users\\Asus\\eclipse-workspace\\Auto2\\src\\test\\resources\\properties\\testdata.properties");
		properties.load(input);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		
		FileOutputStream output =  new FileOutputStream("C:\\Users\\Asus\\eclipse-workspace\\Auto2\\src\\test\\resources\\properties\\testdata.properties");
		properties.setProperty("testdata", "12345678");
		 properties.store(output, "This is a testdata");
	}

}
