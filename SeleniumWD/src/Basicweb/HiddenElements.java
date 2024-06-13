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

public class HiddenElements {

	WebDriver driver = new ChromeDriver();
	String baseurl = "https://letskodeit.teachable.com/";
	String baseurl1 = "baseUrl2 = \"http://www.expedia.com\";\r\n";
	
	
	@Before
	public void setUp() throws Exception {
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
driver.get(baseurl);
		
driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/pages/practice']")).click();
driver.findElement(By.xpath("//div[@role='main']//a[@href='https://www.letskodeit.com/practice']")).click();


		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
		
		Thread.sleep(3000);
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println("Clicked on hide button");
		System.out.println("Text Box Displayed: " + textBox.isDisplayed());
		
		Thread.sleep(3000);

	}
	
	@Test
	public void test1() {
driver.get(baseurl1);
		
		WebElement childDropdown = driver.findElement(By.id("package-1-age-select-1"));
		System.out.println("Child Drpdown Displayed: " + childDropdown.isDisplayed());

	}
	
	
	@After
	public void tearDown() throws Exception {
	}

	

}
