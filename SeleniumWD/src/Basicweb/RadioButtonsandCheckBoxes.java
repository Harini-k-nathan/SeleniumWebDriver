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

public class RadioButtonsandCheckBoxes {
	
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
		
		WebElement BMWRadioButton = driver.findElement(By.id("bmwradio"));
		BMWRadioButton.click();
		
		Thread.sleep(2000);
		WebElement BenzRadioButton = driver.findElement(By.id("benzradio"));
		BenzRadioButton.click();
		
		Thread.sleep(2000);
		WebElement BMWCheckbox = driver.findElement(By.id("bmwcheck"));
		BMWCheckbox.click();
		
		Thread.sleep(2000);
		WebElement BenzCheckbox = driver.findElement(By.id("benzcheck"));
		BenzCheckbox.click();
		
		Thread.sleep(2000);
		
		System.out.println("The BMW Radio Button is selected? " + BMWRadioButton.isSelected());
		System.out.println("The Benz Radio Button is selected? " + BenzRadioButton.isSelected());
		System.out.println("The BMW Check Box is selected? " + BMWCheckbox.isSelected());
		System.out.println("The Benz Check Box is selected? " + BenzCheckbox.isSelected());
		
		
		
	}


	@After
	public void tearDown() throws Exception {
		driver.quit();
		
	}

	
}
