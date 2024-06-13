package JavaScriptExecutionDemo;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class ScrolIntoViewElement {
	
	WebDriver driver;
	String baseURL = "https://www.redbus.in/";
	private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		
ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		driver =new ChromeDriver(options);
		js = (JavascriptExecutor)driver;
		
		//driver.get(baseURL);
		
		js.executeScript("window.location = 'https://www.letskodeit.com/practice'; ");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
//		
//		long height = (Long) js.executeScript(" return window.innerHeight;");
//		long width = (Long) js.executeScript(" return window.innerWidth;");
//		
//		System.out.println("Height of the window is " + height);
//		System.out.println("Width of the window is " + width);
		
		
		
	}
	
	@Test
	public void test() throws InterruptedException {
		
		// Scroll down
		
				js.executeScript("window.scrollBy(0, 1900);");
				Thread.sleep(3000);

				// Scroll Up
				js.executeScript("window.scrollBy(0, -1900);");
				Thread.sleep(3000);
				
				WebElement element = driver.findElement(By.id("mousehover"));
				
				js.executeScript("arguments[0].scrollIntoView(true);", element);
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0, -190);");
				 element.click();
					Thread.sleep(3000);

		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		
	}

	

}
