package KeyPressEvents;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KpressUsingActionClass {
	
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
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	}

}
