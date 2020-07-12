package webAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	
	@Test
	public void launchGrid() throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver","D:\\LearningHat\\chromedriver_win32\\chromedriver.exe");
		
		DesiredCapabilities cap = new DesiredCapabilities().chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		ChromeOptions option = new ChromeOptions();
		option.merge(cap);
		
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.91.1:4444/wd/hub"), option);
		
		driver.get("http://automationpractice.com");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
	}

}
