package Basicweb;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {
	
	WebDriver driver = new ChromeDriver();
	String baseurl = "https://letskodeit.teachable.com/";
	

	@Before
	public void setUp() throws Exception {
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void test() throws InterruptedException {
		 driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/pages/practice']")).click();
		 driver.findElement(By.xpath("//div[@role='main']//a[@href='https://www.letskodeit.com/practice']")).click();
			
		 WebElement DropDown = driver.findElement(By.id("carselect"));
		 Select carDropDown = new Select(DropDown);
		 
		 Thread.sleep(3000);
		 carDropDown.selectByValue("benz");
		 

		 Thread.sleep(3000);
		 carDropDown.selectByIndex(2);
		 
		 Thread.sleep(3000);
		 carDropDown.selectByVisibleText("BMW");
		 
		 Thread.sleep(3000);
		 List<WebElement> DropDownList = carDropDown.getOptions();
		 
		 
		int size = DropDownList.size();
		System.out.println(size);
		
	
		
		for (int i=0; i<size; i++) {
			String optionname = DropDownList.get(i).getText();
			System.out.println(optionname);
			
		}
		 
		 
	}


	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

	
}
