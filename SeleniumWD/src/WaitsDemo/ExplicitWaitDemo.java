package WaitsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
		
		String baseurl = "https://www.letskodeit.com/practice";
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		
		
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement Emailfield = wait.until(
				(ExpectedConditions.visibilityOfElementLocated
					(By.xpath("//input[@placeholder='Email Address']"))));
		Emailfield.sendKeys("Harini@gmail.com");
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
