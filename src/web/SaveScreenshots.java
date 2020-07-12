package web;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SaveScreenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\LearningHat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Launch the browser
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
		//Specify
		File destinationScreenshot = new File("C:\\Users\\Rajlaxmi\\eclipse-workspace\\SeleniumTesting\\Screenshots\\HomeScreenShot1.png");
		
		//
		TakesScreenshot homePageScreenshot = (TakesScreenshot)driver;
		 File screnshotFile = homePageScreenshot.getScreenshotAs(OutputType.FILE);
		 
		 //File screnshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 Files.copy(screnshotFile, destinationScreenshot);
		 
		 
		
	}

}
