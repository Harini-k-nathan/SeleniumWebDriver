package JavaScriptExecutionDemo;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClickElementUsingJS {
	
	WebDriver driver;
	private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		
		
		driver = new ChromeDriver();
		js = (JavascriptExecutor)driver;
		
		js.executeScript("window.location = 'https://www.letskodeit.com/practice';");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		
		WebElement BMWButton = driver.findElement(By.id("bmwradio"));
		js.executeScript("arguments[0].click();", BMWButton);
		
		Thread.sleep(3000);
		
		
		
			}

}
