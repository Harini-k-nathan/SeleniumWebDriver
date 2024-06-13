package Basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SomeBasicActions {
	WebDriver driver = new ChromeDriver();
	String baseurl = "https://letskodeit.teachable.com/";

	@Before
	public void setUp() throws Exception {
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void test() {
		driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/pages/practice']")).click();
		
		driver.findElement(By.xpath("//div[@role='main']//a[@href='https://www.letskodeit.com/practice']")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("Harini");
		driver.findElement(By.name("enter-name")).sendKeys("Harini");
		driver.findElement(By.id("autosuggest")).clear();

		
		
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}
	

	
	

}
