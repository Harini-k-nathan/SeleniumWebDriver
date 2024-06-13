package AdvancedInteractionsDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoCompleteDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		String baseURl = "https://www.goibibo.com/";
		WebDriver driver;
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		driver =new ChromeDriver(options);
		

		driver.get(baseURl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement LoginClosebutton = driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
		LoginClosebutton.click();
		
		WebElement FlightsTab = driver.findElement(By.xpath("//a[@href='/flights/']"));
		FlightsTab.click();
		
		String partialtext = "Che";
		//String TextToBeSelected = "Chengdu, China";
		
	    Thread.sleep(13000);
	
		
		WebElement FromDestinationTab = driver.findElement(By.xpath("//div[@class='sc-12foipm-2 eTBlJr fswFld ']"));
		
		FromDestinationTab.click();
		
		WebElement FromTab = driver.findElement(By.xpath("//input[@type='text']"));
		FromTab.sendKeys(partialtext);
		
		Thread.sleep(4000);
		
		//WebElement ulelement = driver.findElement(By.xpath("//div[@class='sc-12foipm-24 bDSkOK']"));
		
		WebElement lielements = driver.findElement
		(By.xpath("//li[contains(@role,'presentation')  and contains(@tabindex,'1')]//span[@class='autoCompleteTitle ']"));
		
		lielements.click();
		Thread.sleep(3000);
		driver.quit();
		
		
		//for (WebElement element : liElements) {
			
	/*System.out.println(element.getText());
	
			if (element.getText().contains(TextToBeSelected)) {
				System.out.println("Selected: " + element.getText());
				element.click();
				break;
*/
			
		
		}
		
		
	


	}





