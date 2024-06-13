package UsefulMethodsDemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isElementPresentDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://www.letskodeit.com/practice";
		driver.get(baseURL);
		
		 GenericMethods gm = new GenericMethods(driver);
		 
		 boolean result1 = gm.isElementPresent("name", "id");
		 
		 System.out.println("isElementPresent " + result1);
		 
		 boolean result2 = gm.isElementPresent("nameisnotpresenrt", "id"); 
		 
		 System.out.println("isElementPresent " + result2);
		 
		 List<WebElement> element = gm.ListofElements("//input[@name='cars']", "xpath");
		 
		int size = element.size();
		
		System.out.println("The size of elements is " + size);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
