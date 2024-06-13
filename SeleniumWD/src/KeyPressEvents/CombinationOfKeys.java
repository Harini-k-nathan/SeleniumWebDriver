package KeyPressEvents;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CombinationOfKeys {

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
	public void test() {
		
		//driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL + "a");
		
		driver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.CONTROL + "a"));
		
		
	}

}
