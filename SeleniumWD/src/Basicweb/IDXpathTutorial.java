package Basicweb;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDXpathTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "D:\\\\Harini\\\\Driver\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String URL = "https://learn.letskodeit.com";
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(URL);
	 driver.findElement(By.xpath("//a[@href='/sign_in']")).click(); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys("hariniksv10@gmail.com");
	
	
	
	
		

	}

}
