package SwitchWindowIFrames;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUps {
	
	WebDriver driver;
	String baseurl;

	@Before
	public void setUp() throws Exception {

		driver = new ChromeDriver();
		baseurl = "https://www.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get(baseurl);
	}
	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(10000);
		driver.quit();
}

	@Test
	public void test() throws InterruptedException {
		
		
		 driver.findElement(By.id("name")).sendKeys("Harini");
		
		 driver.findElement(By.id("alertbtn")).click();
		 Thread.sleep(3000);
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
	}
	
	@Test
	public void test1() throws InterruptedException {
		
		 driver.findElement(By.id("name")).sendKeys("Harini");
			
		 driver.findElement(By.id("confirmbtn")).click();
		 Thread.sleep(3000);
		 Alert alert = driver.switchTo().alert();
		 alert.dismiss();
		 //alert.accept();
		
	}
		 
		 
		 
		 

	
	

	

	
	
}
