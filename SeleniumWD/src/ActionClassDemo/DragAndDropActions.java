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

public class DragAndDropActions {
	
	WebDriver driver;
	String baseurl;
    private JavascriptExecutor js;


	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		js = (JavascriptExecutor)driver;
		baseurl = "https://jqueryui.com/droppable/";
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
		
		WebElement fromelement = driver.findElement(By.id("draggable"));
		
		WebElement toelement = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		//Drag and drop
		
		//action.dragAndDrop(fromelement, toelement).build().perform();
		
		//click and hold, move to the element, release, build and perform
		
		action.clickAndHold(fromelement).moveToElement(toelement).release().build().perform();
		
		
	}

}
