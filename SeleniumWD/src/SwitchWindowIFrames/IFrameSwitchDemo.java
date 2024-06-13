package SwitchWindowIFrames;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IFrameSwitchDemo {

	WebDriver driver;
	String baseurl;

	@Before
	public void setUp() throws Exception {

		driver = new ChromeDriver();
		baseurl = "https://www.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(10000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseurl);
		Thread.sleep(3000);
		// Switch to frame by Id
		driver.switchTo().frame("courses-iframe");
		// Switch to frame by name
		//driver.switchTo().frame("iframe-name");
		// Switch to frame by numbers
		//driver.switchTo().frame(0);
		
		 WebElement searchbutton = driver.findElement(By.xpath("//input[@id='search' and @name='course']"));
		 searchbutton.sendKeys("Selenium");
		 
		 driver.switchTo().defaultContent();
		 Thread.sleep(5000);
		 driver.findElement(By.id("name")).sendKeys("Test Successful");
		

	}

}
