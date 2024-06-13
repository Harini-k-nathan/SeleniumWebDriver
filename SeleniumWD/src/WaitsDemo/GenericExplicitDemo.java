package WaitsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Utilities.WaitTypes;

public class GenericExplicitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		String baseurl = "https://www.letskodeit.com/practice";
		WaitTypes wt =  new WaitTypes(driver);
		
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();

		WebElement emailfield = wt.waitForElement(By.xpath("//input[@placeholder='Email Address']"), 3);
		emailfield.sendKeys("Harini@gmail.com");
	}

}
