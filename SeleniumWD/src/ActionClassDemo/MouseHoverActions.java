package ActionClassDemo;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHoverActions {
	
	WebDriver driver;
	String baseurl;
    private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		

		driver = new ChromeDriver();
		js = (JavascriptExecutor)driver;
		baseurl = "https://www.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get(baseurl);
	}

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(10000);
		driver.quit();
		
		
	}

	@Test
	public void test() throws InterruptedException {
		
		
		js.executeScript("window.scrollBy(0, 700)");
		WebElement mousehover = driver.findElement(By.id("mousehover"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(mousehover).perform();
		
		Thread.sleep(5000);
		
		WebElement SubElement = driver.findElement(By.xpath("//div[@class='mouse-hover']//a[text()='Top']"));
		
		action.moveToElement(SubElement).click().perform();
		
	}

}
