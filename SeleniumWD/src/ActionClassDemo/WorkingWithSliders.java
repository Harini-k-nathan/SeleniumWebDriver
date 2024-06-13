package ActionClassDemo;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithSliders {
	
	WebDriver driver;
	String baseurl;
    private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		

		driver = new ChromeDriver();
		js = (JavascriptExecutor)driver;
		baseurl = "https://jqueryui.com/slider/";
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
		
		
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']//span"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(slider, 150, 0).perform();
	}

}
