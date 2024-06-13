package WaitsDemo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		String baseurl = "https://www.letskodeit.com/practice";
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//instead of giving wait for all the elements we are commonly giving it to wait for 
		//3 seconds for all the elements
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harini@gmail.com");
		
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
