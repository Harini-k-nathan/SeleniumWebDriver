package Basicweb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Harini\\Driver\\geckodriver-v0.34.0-win64-unzip\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url = "http://learn.letskodeit.com";
		driver.get(url);
		
		
		
		
		
		
	}

}
