package KeyPressEvents;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPressDemo {
	
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
		
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		WebElement login = driver.findElement(By.xpath("//a[@href='/login']"));
		
		login.click();
		
		driver.findElement(By.id("email")).sendKeys("harini.k.nathan@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("login-password")).sendKeys("harini");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
		
		
		
		
	}

}
