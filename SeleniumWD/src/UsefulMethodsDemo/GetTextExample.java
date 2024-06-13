package UsefulMethodsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		String baseURL = "https://www.letskodeit.com/practice";
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ConfirmButton = driver.findElement(By.id("opentab"));
		System.out.println("opentab is identified");
		
		String Button = ConfirmButton.getText();
		System.out.println(" Text on the element is " + Button);
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
