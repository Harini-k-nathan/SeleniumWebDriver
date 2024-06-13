package Basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementState {
	

	WebDriver driver = new FirefoxDriver();
	String baseurl = "https://www.google.com/";

	@Before
	public void setUp() throws Exception {
		
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void test() {
		WebElement e1 = driver.findElement(By.className("gLFyf"));
		System.out.println("e1 is enabled? " + e1.isEnabled());
		e1.sendKeys("Harini");
		
	
		
	}

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(3000);
		driver.quit();
	}

	

}
