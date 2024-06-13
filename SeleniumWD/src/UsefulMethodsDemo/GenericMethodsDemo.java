package UsefulMethodsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import UsefulMethodsDemo.GenericMethods;


public class GenericMethodsDemo {

	WebDriver driver;
	String gm;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
WebDriver driver = new ChromeDriver();
GenericMethods gm = new GenericMethods(driver);

		
		String baseURL = "https://www.letskodeit.com/practice";
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = gm.getElement("autosuggest", "id");
		element.sendKeys("Harini");
		
		Thread.sleep(3000);
		driver.quit();

	}

}
