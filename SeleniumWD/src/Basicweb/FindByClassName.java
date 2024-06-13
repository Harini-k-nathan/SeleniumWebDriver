package Basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Harini\\Driver\\geckodriver-v0.34.0-win64-unzip\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL = "https://learn.letskodeit.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);


	}

}
