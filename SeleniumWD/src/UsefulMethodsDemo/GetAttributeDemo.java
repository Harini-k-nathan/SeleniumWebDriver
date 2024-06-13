package UsefulMethodsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
WebDriver driver = new ChromeDriver();
		
		String baseURL = "https://www.letskodeit.com/practice";
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.id("carselect"));
		String carDropDown = element.getAttribute("name");
		
		System.out.println("The name of the attribute is " + carDropDown);
		
		driver.quit();
		
	}

}
