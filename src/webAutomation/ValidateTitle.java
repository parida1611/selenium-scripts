package webAutomation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ValidateTitle {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","D:\\LearningHat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		TakesScreenshot srcShot = (TakesScreenshot)driver;	
	
		driver.get("http://automationpractice.com");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Automation Practice";
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Title Validation passed successfully");
		}else {
			System.out.println("Title Validation Failed.");
			System.out.println("Expected value was: "+ expectedTitle + " but got "+ actualTitle + " as the actual value.");
			
			File originalScreenShot = srcShot.getScreenshotAs(OutputType.FILE);
			File actualScreenshot = new File("D:\\LearningHat\\screenshot\\validateTitleFailure.png");
			try {
				Files.copy(originalScreenShot, actualScreenshot);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		driver.quit();
		
		
		
		
	}

}
