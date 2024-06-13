package BrowserProfilesTutorial;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String baseURl = "https://www.google.com/";
		WebDriver driver;
		
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(" \\Users\\Harini\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\ndgimibanhlabgdgjcpbbndiehljcpfh\\5.2.7_0.crx"
				));
		
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
		driver.get(baseURl);
		
		

	}

}
