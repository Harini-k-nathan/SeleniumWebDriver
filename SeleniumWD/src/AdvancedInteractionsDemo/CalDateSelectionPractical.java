package AdvancedInteractionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class CalDateSelectionPractical {
	
	WebDriver driver;
	String baseURL = "https://www.redbus.in/";
	
	
	
	@Before
	public void setUp() throws Exception {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		driver =new ChromeDriver(options);
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}
	
	
	@Test
	public void test() throws InterruptedException {
		
		WebElement BusTab = driver.findElement(By.xpath("//li[@id='bus_tickets_vertical']"));
		BusTab.click();
		
		WebElement Calender = driver.findElement(By.xpath("//div[@id='onwardCal']"));
		Calender.click();
		
		Thread.sleep(10000);
		
		WebElement dateToSelect = driver.findElement
				(By.xpath("//div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']//span[text()='8']"));
		
		dateToSelect.click();
		
		WebElement SearchButton = driver.findElement(By.id("search_button"));
		SearchButton.click();
		
		System.out.println("Search button is clicked");
	
	}

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(3000);
		//driver.quit();
	}

	

}
