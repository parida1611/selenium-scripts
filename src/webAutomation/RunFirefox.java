package webAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.internal.Configuration;

public class RunFirefox {
	
	@Test
	public void launch() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rajlaxmi\\Documents\\software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		
		WebDriver driver = new FirefoxDriver();
//		DesiredCapabilities capabilities =
//				new DesiredCapabilities(DesiredCapabilities.firefox().getBrowserName(), "ESR", Platform.ANY);
//				capabilities.setCapability("marionette", true);
//		
//				WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://automationpractice.com");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String actualTitle = driver.getTitle();
	}

}
