package Basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingBetweenPages {
	
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
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("The CurrentURL is " + CurrentURL);
		String Title = driver.getTitle();
		System.out.println("The Title of the page is " + Title);
		
		
		String LoginURL = "https://sso.teachable.com/secure/42299/identity/login/password";
		driver.navigate().to(LoginURL);
		String CurrentURL1 = driver.getCurrentUrl();
		driver.get(CurrentURL1);
		System.out.println("The LoginURL is " + CurrentURL1);
		
		Thread.sleep(3000);
		
		
		driver.navigate().back();
		String CurrentURL2 = driver.getCurrentUrl();
		driver.get(CurrentURL2);
		System.out.println("The Navigate back URL is " + CurrentURL2);
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		String CurrentURL3 = driver.getCurrentUrl();
		driver.get(CurrentURL3);
		System.out.println("The Navigate forward URL is " + CurrentURL3);
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		String CurrentURL4 = driver.getCurrentUrl();
		driver.get(CurrentURL4);
		System.out.println("The Navigate back URL is " + CurrentURL4);
		
		Thread.sleep(3000);
		
		
		driver.navigate().refresh();
		System.out.println("Navigate Refreshed");
		driver.navigate().refresh();
		String CurrentURL5 = driver.getCurrentUrl();
		driver.get(CurrentURL5);
		System.out.println("CurrentURl is " + CurrentURL5);
		
		Thread.sleep(3000);
		
		//String PageSource = driver.getPageSource();
		//System.out.println("The PageSource is" + PageSource);
		
		
		
		
		
		
	}

	

	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	
}
