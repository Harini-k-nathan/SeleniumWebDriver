package Basicweb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeDriverTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.setProperty("webdriver.chrome.driver", "D:\\Harini\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "http://www.letskodeit.com";
		driver.get(URL);

	}

}
