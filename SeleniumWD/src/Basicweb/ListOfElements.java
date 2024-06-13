package Basicweb;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfElements {


	WebDriver driver = new ChromeDriver();
	String baseurl = "https://letskodeit.teachable.com/";
	
	@Before
	public void setUp() throws Exception {
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void test() throws InterruptedException {
		    driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/pages/practice']")).click();
			driver.findElement(By.xpath("//div[@role='main']//a[@href='https://www.letskodeit.com/practice']")).click();
			
			List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[contains(@name,'cars') and contains(@type,'radio')]"));
			Boolean isSelected = false;
			
			int size = radiobuttons.size();
			System.out.println("The size of the radiobuttons is " + size);
			
			for (int i=0; i<size; i++) {
				isSelected = radiobuttons.get(i).isSelected();
				
				if(!isSelected) {
					radiobuttons.get(i).click();
					Thread.sleep(3000);
					
					
				}
				
			}
	}


	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}

	
}
