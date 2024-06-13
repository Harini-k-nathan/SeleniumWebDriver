package Basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkPartialTextTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "D:\\Harini\\Driver\\geckodriver-v0.34.0-win64-unzip\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String URL = "https://learn.letskodeit.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		
		
		driver.findElement(By.linkText("Login")).click();;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Log in")).click();;
		
		System.out.println("Run Successful");
		
		
	}

}
