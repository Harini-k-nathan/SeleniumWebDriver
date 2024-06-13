package SwitchWindowIFrames;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class windowSwitchDemo {
	
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
		
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseurl);
		/*
		 * WebElement openwindow = driver.findElement(By.id("openwindow"));
		 * openwindow.click();
		 * 
		 * WebElement searchbutton = driver.findElement(By.id("search"));
		 * searchbutton.sendKeys("Selenium");
		 */
		
		String parenthandle = driver.getWindowHandle();
		System.out.println("The Parent Handle Window is" + parenthandle);
		
		
		WebElement openwindow = driver.findElement(By.id("openwindow"));
	     openwindow.click();
	     
	     
	     Set<String> Handles = driver.getWindowHandles();
	     
	     for (String nextwindowhandles : Handles) {
	    	 System.out.println(nextwindowhandles);
	    	 if(!nextwindowhandles.equals(parenthandle)) {
	    		 driver.switchTo().window(nextwindowhandles);
	    		 WebElement searchbutton = driver.findElement(By.xpath("//input[@id='search' and @name='course']"));
	    		 searchbutton.sendKeys("Selenium");
	    		 Thread.sleep(2000);
	    		 driver.close();
	    		 break;
	    		 }
	     }
	     
	     driver.switchTo().window(parenthandle);
	     driver.findElement(By.id("name")).sendKeys("Test Successful");
	     
	     Thread.sleep(3000);
		
;		
	}

}
