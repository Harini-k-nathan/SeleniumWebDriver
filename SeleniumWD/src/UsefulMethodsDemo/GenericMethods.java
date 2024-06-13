package UsefulMethodsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods {

	WebDriver driver;
	
	public GenericMethods(WebDriver driver) {
		
		this.driver = driver; 
	}
	
	public WebElement getElement (String locator, String type) {
		type = type.toLowerCase();
		
		if (type.equals("id")) {
			System.out.println("The element found with id " + locator);
			return this.driver.findElement(By.id(locator));
			
		}
			
		else if (type.equals("xpath")){
			System.out.println("the element found with xpath " + locator);
			return this.driver.findElement(By.xpath(locator));
			
			
		}
		
		else if (type.equals("cssSelector")) {
			System.out.println("The element found with cssSelector " + locator);
			return this.driver.findElement(By.cssSelector(locator));
			
		}
		
		else if (type.equals("linkText")) {
			System.out.println("The element found with linkText " + locator);
			return this.driver.findElement(By.linkText(locator));
		}
		
		else 
			System.out.println("locator type not found");
		return null;
	}
	
	
	 public List<WebElement> ListofElements (String locator, String type) {
		  type = type.toLowerCase();
		  
		  if (type.equals("id")) {
			  System.out.println("The elements found with id " + locator);
			  return this.driver.findElements(By.id(locator));
			  
		  }
		 
		  else if (type.equals("xpath")){
				System.out.println("the element found with xpath " + locator);
				return this.driver.findElements(By.xpath(locator));
				
				
			}
			
			else if (type.equals("cssSelector")) {
				System.out.println("The element found with cssSelector " + locator);
				return this.driver.findElements(By.cssSelector(locator));
				
			}
			
			else if (type.equals("linkText")) {
				System.out.println("The element found with linkText " + locator);
				return this.driver.findElements(By.linkText(locator));
			}
			
			else 
				System.out.println("locator type not found");
			return null;
		 
		 
			
		 
	 }

    
 public boolean isElementPresent (String locator, String type) {
    	 
    	List<WebElement> ElementList = ListofElements(locator, type);
    			
    			int size = ElementList.size();
    	
    	        if (size > 0) {
    	        	return true;
    	        }
    	        	
    	        	else {
    	        		return false;
    	        		
    	        	}
    	        }
     }