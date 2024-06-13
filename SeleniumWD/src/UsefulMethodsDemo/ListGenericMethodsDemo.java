package UsefulMethodsDemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import UsefulMethodsDemo.GenericMethods;

public class ListGenericMethodsDemo {

	WebDriver driver;
	String baseURL;
	String gm;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://www.letskodeit.com/practice";
		driver.get(baseURL);
		
		 GenericMethods gm = new GenericMethods(driver);
		 
		 List<WebElement> element = gm.ListofElements("//input[@name='cars']", "xpath");
		 
		int size = element.size();
		
		System.out.println("The size of elements is " + size);
		
		Thread.sleep(3000);
		driver.quit();
		
	}	
	
}
