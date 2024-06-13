package AdvancedInteractionsDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalDataDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String baseURl = "https://www.redbus.in/";
		WebDriver driver;
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		driver =new ChromeDriver(options);
		

		driver.get(baseURl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement BusTab = driver.findElement(By.xpath("//li[@id='bus_tickets_vertical']"));
		BusTab.click();
		
		WebElement Calender = driver.findElement(By.xpath("//div[@id='onwardCal']"));
		Calender.click();
		
		Thread.sleep(5000);
		
		//WebElement dateToSelect = driver.findElement
				//(By.xpath("//div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']//span[text()='8']"));
		
		//dateToSelect.click();
		
		
		
		
		
		WebElement dateToSelect = driver.findElement
				(By.xpath("//div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']"));
		
		List<WebElement> DateList = dateToSelect.findElements(By.tagName("span"));
		
		for (WebElement date : DateList) {
			
			if (date.getText().equals("30")) {
				
				date.click();
				
				break;
			}
		}
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
