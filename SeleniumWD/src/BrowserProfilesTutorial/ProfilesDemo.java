package BrowserProfilesTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;


public class ProfilesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		String baseurl = "https://www.letskodeit.com/";
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fxProfile = profile.getProfile("AutomationProfile");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(fxProfile);

		
		
		driver = new FirefoxDriver(options);
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

	}

}
